package com.example.leecode;

public class LeeCode2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode l2 = new ListNode(1,new ListNode(2,new ListNode(3)));
        ListNode re = new ListNode();
        addTwoNumbers(l1, l2, re, 0);
        ListNode listNode = re;
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    /**
     *
     * @param l1
     * @param l2
     * @param result
     * @param carryOver
     * @return
     */
    public static int addTwoNumbers(ListNode l1, ListNode l2,ListNode result,int carryOver) {
        int currNum = 0;
        // 和
        int sum = l1.val + l2.val + carryOver;
        if (sum >= 10) {
            carryOver = 1;
            currNum = sum-10;
        } else {
            carryOver = 0;
            currNum = sum;
        }
        result.val = currNum;
        result.next = new ListNode();
        if (l1.next == null && l2.next == null) {
            return 1;
        } else {
            if (l1.next == null){
                l1.next = new ListNode(0);
            }
            if (l2.next == null){
                l2.next = new ListNode(0);
            }
            return addTwoNumbers(l1.next,l2.next,result.next,carryOver);
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
