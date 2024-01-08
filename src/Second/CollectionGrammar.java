package Second;

import java.util.*;

public class CollectionGrammar {
    public static void main(String[] args) {
        // ArrayList
        System.out.println("-----------------------ArrayList-----------------------");
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.println(intList.get(0)); // 1 출력
        System.out.println(intList.get(1)); // 2 출력
        System.out.println(intList.get(2)); // 3 출력
        System.out.println(intList.toString()); // [1,2,3] 출력

        intList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(intList.get(1)); // 10 출력

        intList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println(intList.toString()); // [1,3] 출력

        intList.clear(); // 전체 값을 삭제합니다.
        System.out.println(intList.toString()); // [] 출력

        // LinkedList
        System.out.println("-----------------------LinkedList-----------------------");
        LinkedList<Integer> linkedList = new LinkedList<>(); // 선언 및 생성

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
//        linkedList.add(1, 5); // 이렇게 인덱스 지정하고 추가하는 방법도 있음

        System.out.println(linkedList.get(0)); // 1 출력
        System.out.println(linkedList.get(1)); // 2 출력
        System.out.println(linkedList.get(2)); // 3 출력
//        System.out.println(linkedList.get(3)); // 4 출력
        System.out.println(linkedList.toString()); // [1,2,3] 출력 (속도 느림)

        linkedList.add(2, 4); // 2번 순번에 4 값을 추가합니다.
        System.out.println(linkedList); // [1,2,4,3] 출력

        linkedList.set(1, 10); // 1번순번의 값을 10으로 수정합니다.
        System.out.println(linkedList.get(1)); // 10 출력

        linkedList.remove(1); // 1번순번의 값을 삭제합니다.
        System.out.println(linkedList); // [1,4,3] 출력

        linkedList.clear(); // 전체 값을 삭제합니다.
        System.out.println(linkedList); // [] 출력

        // Stack
        System.out.println("-----------------------Stack-----------------------");
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 3,2,1 출력
        }

        // 다시 추가
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        // 다 지워지 때까지 출력
        while(!intStack.isEmpty()) {
            System.out.println(intStack.pop());
            // stack에 저장된 값의 가장 마지막 저장한 값을 하나씩 뻐져나온다 생각하면 됩니다.
            // 즉, stack에서 빠지고 콘솔에 출력된다는 의미입니다.
        }

        // peek()
        System.out.println(intStack.peek()); // 3 출력
        System.out.println(intStack.size()); // 3 출력 (peek() 할때 삭제 안됬음)

        // pop()
        System.out.println(intStack.pop()); // 3 출력
        System.out.println(intStack.size()); // 2 출력 (pop() 할때 삭제 됬음)

        System.out.println(intStack.pop()); // 2 출력
        System.out.println(intStack.size()); // 1 출력 (pop() 할때 삭제 됬음)

        while (!intStack.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intStack.pop()); // 1 출력 (마지막 남은거 하나)
        }

        // Queue (FIFO : First In First Out)
        System.out.println("-----------------------Queue-----------------------");
        // LinkedList 를 생성하면 Queue 기능을 할 수 있습니다. (Queue 가 부모/ LinkedList 가 자식이기 떄문)
        Queue<Integer> intQueue = new LinkedList<Integer>();

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        while (!intQueue.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intQueue.poll()); // 1,2,3 출력
        }

        // 다시 추가
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        // peek()
        System.out.println(intQueue.peek()); // 1 출력 (맨먼저 들어간값이 1 이라서)
        System.out.println(intQueue.size()); // 3 출력 (peek() 할때 삭제 안됬음)

        // poll()
        System.out.println(intQueue.poll()); // 1 출력
        System.out.println(intQueue.size()); // 2 출력 (poll() 할때 삭제 됬음)

        System.out.println(intQueue.poll()); // 2 출력
        System.out.println(intQueue.size()); // 1 출력 (poll() 할때 삭제 됬음)

        while (!intQueue.isEmpty()) { // 다 지워질때까지 출력
            System.out.println(intQueue.poll()); // 3 출력 (마지막 남은거 하나)
        }

        // Set
        System.out.println("-----------------------Set-----------------------");
        Set<Integer> intSet = new HashSet<Integer>(); // 선언 및 생성

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(3); // 중복된 값은 덮어씁니다.
        intSet.add(3); // 중복된 값은 덮어씁니다.

        for (Integer value : intSet) {
            System.out.println(value); // 1,2,3 출력
        }

        // contains()
        System.out.println(intSet.contains(2)); // true 출력
        System.out.println(intSet.contains(4)); // false 출력

        // remove()
        intSet.remove(3); // 3 삭제

        for (Integer value : intSet) {
            System.out.println(value); // 1,2 출력
        }

        // Map
        System.out.println("-----------------------Map-----------------------");
        Map<String, Integer> intMap = new HashMap<>(); // 선언 및 생성

        //          키 , 값
        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("삼", 14); // 중복 Key값은 덮어씁니다.
        intMap.put("삼", 15); // 중복 Key값은 덮어씁니다.

        // key 값 전체 출력
        for (String key : intMap.keySet()) {
            System.out.println(key); // 일,이,삼 출력
        }

        // value 값 전체 출력
        for (Integer key : intMap.values()) {
            System.out.println(key); // 11,12,15 출력
        }

        // get()
        System.out.println(intMap.get("삼")); // 15 출력
    }
}
