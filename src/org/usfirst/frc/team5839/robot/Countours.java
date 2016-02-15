package org.usfirst.frc.team5839.robot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Countours {
	
	private ArrayList<Countour> countours;

	public ArrayList<Countour> getCountours() {
		return countours;
	}

	public void setCountours(ArrayList<Countour> countours) {
		this.countours = countours;
	}

	public void trimToSize() {
		countours.trimToSize();
	}

	public void ensureCapacity(int minCapacity) {
		countours.ensureCapacity(minCapacity);
	}

	public int size() {
		return countours.size();
	}

	public boolean isEmpty() {
		return countours.isEmpty();
	}

	public boolean contains(Object o) {
		return countours.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return countours.containsAll(c);
	}

	public int indexOf(Object o) {
		return countours.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return countours.lastIndexOf(o);
	}

	public Object clone() {
		return countours.clone();
	}

	public Object[] toArray() {
		return countours.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return countours.toArray(a);
	}

	public Countour get(int index) {
		return countours.get(index);
	}

	public String toString() {
		return countours.toString();
	}

	public Countour set(int index, Countour element) {
		return countours.set(index, element);
	}

	public boolean add(Countour e) {
		return countours.add(e);
	}

	public void add(int index, Countour element) {
		countours.add(index, element);
	}

	public boolean equals(Object o) {
		return countours.equals(o);
	}

	public Countour remove(int index) {
		return countours.remove(index);
	}

	public boolean remove(Object o) {
		return countours.remove(o);
	}

	public int hashCode() {
		return countours.hashCode();
	}

	public void clear() {
		countours.clear();
	}

	public boolean addAll(Collection<? extends Countour> c) {
		return countours.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends Countour> c) {
		return countours.addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		return countours.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return countours.retainAll(c);
	}

	public ListIterator<Countour> listIterator(int index) {
		return countours.listIterator(index);
	}

	public ListIterator<Countour> listIterator() {
		return countours.listIterator();
	}

	public Iterator<Countour> iterator() {
		return countours.iterator();
	}

	public List<Countour> subList(int fromIndex, int toIndex) {
		return countours.subList(fromIndex, toIndex);
	}

	public void forEach(Consumer<? super Countour> action) {
		countours.forEach(action);
	}

	public Spliterator<Countour> spliterator() {
		return countours.spliterator();
	}

	public boolean removeIf(Predicate<? super Countour> filter) {
		return countours.removeIf(filter);
	}

	public void replaceAll(UnaryOperator<Countour> operator) {
		countours.replaceAll(operator);
	}

	public void sort(Comparator<? super Countour> c) {
		countours.sort(c);
	}

	public Countours(ArrayList<Countour> countours) {
		super();
		this.countours = countours;
	}
	

}
