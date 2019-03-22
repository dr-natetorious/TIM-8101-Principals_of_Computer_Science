/// <author>
/// Nate Bachmeier - 2019.03.21
/// </author>
#pragma once
#include <stdio.h>
#include <memory.h>
#include <stdexcept>

namespace Nate
{
	template <class T>
	class __declspec(dllexport) List {
	private:
		T* items;
		int capacity;
		int end;

		void CheckIndex(int index);

		T* CreateBuffer(int size);

	public:
		List(int capacity);
		List();

		T get_Item(int index);

		void add_Item(T item);
	};

	template <class T>
	List<T>::List()
	{
		int capacity = 10;

		// Initialize the items[]
		this->items = this->CreateBuffer(capacity);
		this->capacity = capacity;
		this->end = 0;
	}

	template <class T>
	List<T>::List(int capacity)
	{
		if (capacity < 0)
		{
			throw new out_of_range("capacity must be positive");
		}

		if (capacity < 10)
		{
			capacity = 10;
		}

		// Initialize the items[]
		this->items = this->CreateBuffer(capacity);
		this->capacity = capacity;
		this->end = 0;
	}


	template <class T>
	void List<T>::CheckIndex(int index)
	{
		if (index < 0 || index > capacity - 1)
		{
			throw new out_of_range("invalid index");
		}
	}

	template <class T>
	T* List<T>::CreateBuffer(int size)
	{
		// Initialize the items[]
		T* buffer = new T[size];

		if (buffer == 0)
		{
			throw new runtime_error("out of memory");
		}

		return buffer;
	}

	template <class T>
	T List<T>::get_Item(int index)
	{
		this->CheckIndex(index);
		return this->items[index];
	}

	template <class T>
	void List<T>::add_Item(T item)
	{
		if (this->end < this->capacity - 1)
		{
			this->items[this->end++] = item;
			return;
		}

		T* newItems = this->CreateBuffer(this->capacity * 2);
		memcpy(newItems, this->items, this->capacity - 1);
		free(this->items);

		this->items = newItems;
		this->capacity *= 2;

		this->add_Item(item);
	}
};