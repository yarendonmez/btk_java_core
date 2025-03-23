package _13_polymorphismDemo;

import java.io.File;

public class Main {

    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new ConsoleLogger(), new DataBaseLogger()};
//        for (BaseLogger loggerx:loggers){
//            loggerx.log("Log mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();


    }

}
