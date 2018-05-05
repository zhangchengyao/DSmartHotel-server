from keras.models import Sequential
from keras.layers import Dense, Embedding, Reshape, Concatenate
from sys import argv

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

model.load_weights('user' + str(argv[1]) + '_weights.h5')

res = model.predict([np.array(argv[1]), np.array(argv[2])])