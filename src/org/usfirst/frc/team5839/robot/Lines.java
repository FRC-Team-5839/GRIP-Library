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

public class Lines {
	
	private ArrayList<Line> lines;

	public ArrayList<Line> getLines() {
		return lines;
	}

	public void setLines(ArrayList<Line> lines) {
		this.lines = lines;
	}

	public void trimToSize() {
		lines.trimToSize();
	}

	public void ensureCapacity(int minCapacity) {
		lines.ensureCapacity(minCapacity);
	}

	public int size() {
		return lines.size();
	}

	public boolean isEmpty() {
		return lines.isEmpty();
	}

	public boolean contains(Object o) {
		return lines.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return lines.containsAll(c);
	}

	public int indexOf(Object o) {
		return lines.indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return lines.lastIndexOf(o);
	}

	public Object clone() {
		return lines.clone();
	}

	public Object[] toArray() {
		return lines.toArray();
	}

	public <T> T[] toArray(T[] a) {
		return lines.toArray(a);
	}

	public Line get(int index) {
		return lines.get(index);
	}

	public String toString() {
		return lines.toString();
	}

	public Line set(int index, Line element) {
		return lines.set(index, element);
	}

	public boolean add(Line e) {
		return lines.add(e);
	}

	public void add(int index, Line element) {
		lines.add(index, element);
	}

	public boolean equals(Object o) {
		return lines.equals(o);
	}

	public Line remove(int index) {
		return lines.remove(index);
	}

	public boolean remove(Object o) {
		return lines.remove(o);
	}

	public int hashCode() {
		return lines.hashCode();
	}

	public void clear() {
		lines.clear();
	}

	public boolean addAll(Collection<? extends Line> c) {
		return lines.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends Line> c) {
		return lines.addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		return lines.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return lines.retainAll(c);
	}

	public ListIterator<Line> listIterator(int index) {
		return lines.listIterator(index);
	}

	public ListIterator<Line> listIterator() {
		return lines.listIterator();
	}

	public Iterator<Line> iterator() {
		return lines.iterator();
	}

	public List<Line> subList(int fromIndex, int toIndex) {
		return lines.subList(fromIndex, toIndex);
	}

	public void forEach(Consumer<? super Line> action) {
		lines.forEach(action);
	}

	public Spliterator<Line> spliterator() {
		return lines.spliterator();
	}

	public boolean removeIf(Predicate<? super Line> filter) {
		return lines.removeIf(filter);
	}

	public void replaceAll(UnaryOperator<Line> operator) {
		lines.replaceAll(operator);
	}

	public void sort(Comparator<? super Line> c) {
		lines.sort(c);
	}
	
	

}
