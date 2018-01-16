package multiAgent.AIDecision;

import util.CSVUtils;
import smile.classification.RandomForest;
import smile.data.Attribute;
import smile.data.NumericAttribute;

import java.io.File;
import java.util.List;

/**
 * Created by H77 on 2017/5/10.
 */
public class RandomForestTest {

    public static void main(String[] args){
        File f = new File("/Users/sam/Documents/QQ文件/train.csv");
        List<String> dataSet = CSVUtils.importCsv(f);
        System.out.println(dataSet.get(0));

        Attribute[] attrs = initAttribute(dataSet.get(0).split(","));
        double[][] x = new double[dataSet.size()-1-100][7];
        int [] y = new int[dataSet.size()-1-100];
        for(int i = 1 ; i <(dataSet.size()-100) ; i++){
            String str = dataSet.get(i);
            String[] strs = str.split(",");
            double[]  arr = dataDeal(strs);
            x[i-1] = arr;
            y[i-1] = Integer.parseInt(strs[1]);
        }
         RandomForest  forest = new RandomForest(attrs,x,y,5);

        File f1 = new File("/Users/sam/Documents/QQ文件/train.csv");
        List<String> dataSet1 = CSVUtils.importCsv(f1);
        double[][] testx = new double[100][7];
        int [] testy = new int[100];
        for(int i = (dataSet1.size()-100) ; i <dataSet1.size() ; i++){
            String str = dataSet1.get(i);
            String[] strs = str.split(",");
            double[]  arr = dataDeal(strs);
            testx[i-(dataSet1.size()-100)] = arr;
            testy[i-(dataSet1.size()-100)] = Integer.parseInt(strs[1]);
        }

        int errors = 0;
        for(int i =1 ; i<testx.length ; i++){
            if(forest.predict(testx[i]) != testy[i]){
                errors ++;
            }
        }
        System.out.println("USPS errors = " + errors);
        System.out.println("精确率:"+((1-forest.error())*100));
        System.out.println("精确率:"+(100-errors*100/testx.length));

    }

    public static Attribute[] initAttribute(String[] strs){
        Attribute[] attrs = new Attribute[7];
        attrs[0] = new NumericAttribute(strs[2]);
        attrs[1] = new NumericAttribute(strs[4]);
        attrs[2] = new NumericAttribute(strs[5]);
        attrs[3] = new NumericAttribute(strs[6]);
        attrs[4] = new NumericAttribute(strs[7]);
        attrs[5] = new NumericAttribute(strs[9]);
        attrs[6] = new NumericAttribute(strs[11]);
        return attrs;
    }

    public static double[] dataDeal(String[] strs){

        int length = strs.length;
        int extra = 0;
        if(length == 12) extra = 1;

        double[] arr = new double[7];
        double Pclass = Double.parseDouble(strs[2]);
        double sex = strs[5].equals("male") ? 1 : 0 ;
        if(strs[6].equals("")) strs[6] = "24";
        double age = Double.parseDouble(strs[6]);
        double Sibsp = Double.parseDouble(strs[7]);
        double Parch = Double.parseDouble(strs[8]);
        double Fare = Double.parseDouble(strs[10]);
        double Embarked = 0;
        if(strs[12-extra].equals("S")){
           Embarked = 0;
        }else if(strs[12-extra].equals("C")){
           Embarked = 1;
        }else{
           Embarked = 2;
        }
        arr[0] = Pclass;
        arr[1] = sex;
        arr[2] = age;
        arr[3] = Sibsp;
        arr[4] = Parch;
        arr[5] = Fare;
        arr[6] = Embarked;
        return arr;
    }


}
