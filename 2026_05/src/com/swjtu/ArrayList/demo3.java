package com.swjtu.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class demo3 {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        user u1 = new user(1,"张三","123456");
        user u2 = new user(2,"李四","123456");
        user u3 = new user(3,"王五","123456");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户id");
        int id = sc.nextInt();
        System.out.println(search(list,id));
    }

    static boolean search(ArrayList<user> list,int id){
        for(int i = 0 ;i<list.size();i++){
            if(list.get(i).id==id)
                return true;
        }
        return false;
    }
}
