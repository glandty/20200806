//饿汉模式
class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }
}

//懒汉模式
class Singleton1 {
    private static Singleton1 instance = null;
    private Singleton1() {}
    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}

//多线程懒汉模式
class Singleton2 {
    private static Singleton2 instance = null;
    private Singleton2() {}
    public synchronized static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

//多线程懒汉模式 二次判断
class Singleton3 {
    private static volatile Singleton3 instance = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}


