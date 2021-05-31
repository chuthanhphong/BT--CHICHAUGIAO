package baitapchichaugiao;

import java.util.*;

public class Manager {
    public static Map<Integer, Student> listStudent = new HashMap<>();

    public void addStudent(int id, Student student) {
        listStudent.put(id, student);
    }

    public void display() {
        Set<Integer> keys = listStudent.keySet();
        for (Integer key : keys) {
            System.out.println(key + ":" + listStudent.get(key));
        }
        System.out.println("----------------------------------");

    }

    public void deleteStudent(int id) {
        listStudent.remove(id);
    }

    public boolean check(int id) {
        if (listStudent.containsKey(id)) {
            return true;
        }
        return false;
    }

    public void searchforId(int id) {
        if (check(id)) {
            System.out.println(listStudent.get(id));
        }else {
        System.out.println("không có id này");}
    }

    public void searchforName(String name) {
        Set<Integer> keys = listStudent.keySet();
//        List<Student> students = (List<Student>) listStudent.values();
        Map<Integer, Student> mapSameName = new HashMap<>();
        for (int key : keys) {
            if (listStudent.get(key).getName().equals(name)) {
//                System.out.println(key + "=" + listStudent.get(key));
                mapSameName.put(key, listStudent.get(key));
            }
        }
        System.out.println(mapSameName.values() + "/");
    }

    public void searchforage(int age) {
        Set<Integer> keys = listStudent.keySet();
        Map<Integer, Student> mapSameAge = new HashMap<>();
        for (Integer key : keys) {
            if (listStudent.get(key).getAge() == age) {
                mapSameAge.put(key, listStudent.get(key));
            }
        }

        System.out.println(mapSameAge.values() + " /");
    }

    public Student editforName(int id, Student student) {
        if (!check(id)) {
            return new Student();
        } else
            return listStudent.put(id, student);

    }

    public void sortforName() {
        List<Map.Entry<Integer, Student>> entryList = new LinkedList<>(listStudent.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Student>>() {
            @Override
            public int compare(Map.Entry<Integer, Student> o1, Map.Entry<Integer, Student> o2) {
                int result = o1.getValue().getName().compareTo(o2.getValue().getName());
                if(result==0){
                    return o1.getValue().getAge()- o2.getValue().getAge();
                }
                return result;
            }
        });
        Map<Integer ,Student> newListStudent = new LinkedHashMap<>();
        for(Map.Entry<Integer,Student> entry:entryList){
            newListStudent.put(entry.getKey(),entry.getValue());
        }
        this.listStudent= newListStudent;

    }
}








