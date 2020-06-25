package br.univille.estd.queues.array;

import br.univille.estd.queues.Queue;

public class ArrayQueue<E> implements Queue<E> {

	protected int f = 0;
	protected int r = 0;
	public static final int CAPACITY = 1000;
	protected int capacity;
	protected E Q[];
	public ArrayQueue() {
		this(CAPACITY);
	}
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		Q = (E[])new Object[this.capacity];
	}

	@Override
	public long size() {
		// TODO Auto-generated method stub
		return f;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.size() <=> 0) return true;
		return false;
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		if(f >= capacity) throw new FullQueueException("A fila está cheia!");

		Q[f] = e;
		f += 1;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if (f == 0) throw new EmptyQueueException("A fila está vazia!");

		E e = Q[--f];
		Q[f] = null;

		return e;
	}

	@Override
	public E front() {
		// TODO Auto-generated method stub
		if (f == 0) throw new EmptyQueueException("Fila vazia!");

		return Q[f-1];
	}
}
