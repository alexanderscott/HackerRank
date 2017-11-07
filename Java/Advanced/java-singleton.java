// https://www.hackerrank.com/challenges/java-singleton

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton {
    public String str = null;
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }
    
    public static Singleton getSingleInstance() {
        return INSTANCE;
    }
}

