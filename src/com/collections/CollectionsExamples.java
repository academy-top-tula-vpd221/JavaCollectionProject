package com.collections;

import java.util.*;

public class CollectionsExamples {
    public static void ArrayListExample()
    {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Moscow");
        cities.add("Tula");
        cities.add("Kaluga");
        cities.add("Voroneg");
        cities.add("Kazan");
        cities.add("Irkutsk");

        for(int i = 0; i < cities.size(); i++)
            System.out.println(cities.get(i));
        System.out.println();

        System.out.println(cities.contains("Valdivistok") + "\n");

        cities.set(3, "Kursk");
        cities.remove(4);

        for(int i = 0; i < cities.size(); i++)
            System.out.println(cities.get(i));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++)
            numbers.add((i + 1) * 2);

        System.out.println(numbers.remove(4));
        for(int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
        System.out.println();
    }

    public static void ArrayDequeExample()
    {
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.push("bob");
        deque.push("joe");
        deque.push("sam");
        deque.push("tom");
        deque.push("ben");
        deque.addFirst("billy");

        deque.offer("bob");
        deque.offer("joe");
        deque.offer("sam");
        deque.offer("tom");
        deque.offer("ben");
        deque.addLast("jimmy");


        while(!deque.isEmpty())
        {
            System.out.println(deque.pop());
        }
    }

    public static void SetsExamples()
    {
        HashSet<String> set1 = new HashSet<String>();
//        set1.add("1");
//        set1.add("2");
//        set1.add("3");
//        set1.add("4");
//        set1.add("5");
//        set1.add("6");
//
//        for(String s : set1)
//            System.out.print(s + " ");
//        System.out.println();

        TreeSet<Employee> employees = new TreeSet<Employee>();
        employees.add(new Employee("Sammy", 27));
        employees.add(new Employee("Jimmy", 41));
        employees.add(new Employee("Billy", 19));
        employees.add(new Employee("Tommy", 35));
        employees.add(new Employee("Mikky", 28));

//        for(Employee e : employees)
//            System.out.println(e.name + " " +  e.age);

        TreeSet<Person> persons = new TreeSet<Person>(new PersonAgeComparator());
        persons.add(new Person("Sammy", 27));
        persons.add(new Person("Jimmy", 41));
        persons.add(new Person("Billy", 19));
        persons.add(new Person("Tommy", 35));
        persons.add(new Person("Mikky", 28));

        for(Person p : persons)
            System.out.println(p.name + " " +  p.age);
    }

    public static void MapsExamples()
    {
        //LinkedList<String> list = new LinkedList<String>();

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(71, "Tula");
        map.put(50, "Moscow");
        map.put(37, "Irkutsk");
        map.put(46, "Kursk");



//        for(int key : map.keySet())
//            System.out.println(key + " -> " + map.get(key));


        TreeMap<Integer, String> codes = new TreeMap<Integer, String>();
        codes.put(71, "Tula");
        codes.put(50, "Moscow");
        codes.put(37, "Irkutsk");
        codes.put(46, "Kursk");



//        for(int key : codes.keySet())
//            System.out.println(key + " -> " + codes.get(key));

        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Moscow");
        cities.add("Tula");
        cities.add("Kaluga");
        cities.add("Voroneg");
        cities.add("Kazan");
        cities.add("Irkutsk");

        ListIterator<String> it = cities.listIterator();
        it.next();
        it.add("Leningrad");
        System.out.println("Curr: " + it.next());
        System.out.println("Curr: " + it.previous());


        for(it = cities.listIterator(); it.hasNext();)
            System.out.println(it.next());
    }
}


/*
Interface: Collection

int size()
boolean add(T item)
boolean addAll(Collection<T> collection)
void clear()
boolean contains(object item)
boolean isEmpty()
Iterator<T> iterator()
boolean remove(object item)
boolean removeAll(Collection<T> collection)
boolean retainAll(Collection<T> collection)

object[] toArray()




ArrayList
LinkedList
ArrayDeque
HashSet
TreeSet
LinkedHashSet
PriorityQueue
HashMap
TreeMap


Interfaces: Deque, List, Queue

getFirst, peek, peekFirst, element
getLast, peekLast

push, addFirst, offerFirst
offer, addLast, offerLast

pop, remove, removeFirst, popFirst, poll, pollFirst
popLast, pollLast, removeLast

removeFirstOccurrence(object item)
removeLastOccurrence(object item)


Interfaces Set, NavigableSet, SortedSet

HashSet()
HashSet(Collection)
HashSet(capacity)
HashSet(capacity, k) k = 0.0 .. 1.0

Interface Map<K, V>
clear()
boolean containsKey(key)
boolean containsValue(value)
Set entrySet()
V get(K key)
V getOrDefault(K key)
void put(K key, V value)
void putIfAbsent(K key, V value)
void putAll(Map<K, V>)

Set<K> keySet()
Collection<V> values()

remove(K key)
int size()






 */
