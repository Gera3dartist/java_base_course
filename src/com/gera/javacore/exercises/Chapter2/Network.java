package com.gera.javacore.exercises.Chapter2;

import java.util.ArrayList;

/**
 * Exercise 14
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 28.12.17
 * Time: 15:09
 * To change this template use File | Settings | File Templates.
 */
public class Network {
    ArrayList<Member> members;

    public class Member {
        private String name;
        private ArrayList<Member> friends;

        public Member(String name ) {
            this.name = name;
            friends = new ArrayList<>();
        }
    }

    public Member enroll(String name) {
        Member memb = new Member(name);
        members.add(memb);
        return memb;
    }

    public void leave() {
        members.remove(this); //this is a reference to internal class
    }

    public static void main(String[] args) {
        Network newNetwork = new Network();
        newNetwork.enroll("bobby");
    }

}
