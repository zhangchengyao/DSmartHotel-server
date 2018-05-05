from keras.models import Sequential
from keras.layers import Dense, Embedding, Reshape, Concatenate
from sys import argv
from util import load_dataset

num_users = 1000
num_rooms = 2000
user_attr = 5
room_attr = 3

input1 = Sequential()
input1.add(Embedding(num_users+1, user_attr, input_length=1))
input1.add(Reshape((user_attr, )))
input2 = Sequential()
input2.add(Embedding(num_rooms, room_attr, input_length=1))
input2.add(Reshape((room_attr, )))

model = Sequential()
model.add(Concatenate([input1, input2]))
model.add(Dense(user_attr+room_attr, activation='relu'))
model.add(Dense(user_attr+room_attr, activation='relu'))
model.add(Dense(1, activation='sigmoid'))

model.compile(optimizer='rmsprop', loss='mse', metrics=['accuracy'])

X_train, Y_train = load_dataset(str(argv[1]))

model.fit(X_train, Y_train, batch_size=64, epochs=50)

model.save_weights('user' + str(argv[1]) + '_weights.h5')