package org.example.chapter4.item15.member;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

class DefaultMemberService implements MemberService {
    private static interface MemberRepository {

    }

    private class PrivateClass {

    }

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredClasses());
    }
}
