/**
Nate Bachmeier
	Week 3: Algorithms and Data Structures
	TIM-8101: Principals of Computer Science
	Northcentral University
	March 24th, 2019

	@author Nate Bachmeier
	@version 1.2019.03.24

https://github.com/dr-natetorious
*/

/**
Ensure the header file is included once.
Also include standard C++ headers

Note:
	Typically classes are split into .cpp and .h files.
	With templates it seems they are required to be in the same .h file.

	Having them in separate files results in a cryptic error from the linker.
*/
#pragma once
#include <stdio.h>
#include <memory.h>
#include <stdexcept>

/**
All classes are contained within the namespace Nate
These can be imported as: 'using namespace Nate;'
*/
namespace NateTorious
{
	/**
	Represents a templated list for holding items of type T.
	*/
	template <class T>
	class List {
	private:
		/**
		The items contained within the list.
		*/
		T* items;
		/**
		The current capacity of the list.
		*/
		int capacity;
		/**
		The last position in the array
		*/
		int end;

		/**
		Check if the requested index is within bounds.

		@param index into the items array.
		@exception out_of_range
		*/
		void CheckIndex(int index);
		
		/**
		Creates a buffer of a given size

		@param the length of the array to be created.
		*/
		T* CreateBuffer(int size);

	public:
		/**
		Initializes a new instance of the List class to a given capacity.

		@param the initial size of the backing array.
		*/
		List(int capacity);

		/**
		Initializes a default instance of the List class.
		*/
		List();

		/**
		Gets the item held a given index.

		@param index the position within the list to return
		@exception out_of_range
		*/
		T get_Item(int index);

		/**
		Adds an item to the end of the list.

		@param item the thing to be added.
		*/
		void add_Item(T item);
	};

	/**
	Initializes a default instance of the List class.
	*/
	template <class T>
	List<T>::List()
	{
		// Initial the list to size 10.
		this->capacity = 10;

		// Create the items array
		this->items = this->CreateBuffer(this->capacity);

		// Specify the end of the list is at position zero.
		this->end = 0;
	}

	/**
	Initializes a new instance of the List class with a given initial capacity.

	@param capacity - the initial size of the list.
	*/
	template <class T>
	List<T>::List(int capacity)
	{
		// Confirm the value is valid.
		if (capacity < 0)
		{
			throw new out_of_range("capacity must be positive");
		}

		// If the number is too small round up.
		if (capacity < 10)
		{
			capacity = 10;
		}

		// Initialize the items[] and position pointers.
		this->capacity = capacity;
		this->items = this->CreateBuffer(this->capacity);
		this->end = 0;
	}

	/**
	Check if a requested index is inbounds

	@param index being requested.
	*/
	template <class T>
	void List<T>::CheckIndex(int index)
	{
		if (index < 0 || index > capacity - 1)
		{
			throw new out_of_range("invalid index");
		}
	}

	/**
	Creates a buffer of a given size.

	Note the caller is responsible for deleting the buffer.

	@param the length of the array to be created.
	@return pointer to an allocated buffer.
	@exception runtime_error - unable to allocate memory
	*/
	template <class T>
	T* List<T>::CreateBuffer(int size)
	{
		// Initialize a buffer of the requested size
		T* buffer = new T[size];

		// Check that the allocation was successful.
		if (buffer == 0)
		{
			throw new runtime_error("out of memory");
		}

		// Return the buffer to the caller
		return buffer;
	}

	/**
	Gets the item held a given index.

	@param index the position within the list to return
	@exception out_of_range
	*/
	template <class T>
	T List<T>::get_Item(int index)
	{
		// Check the index can be used.
		this->CheckIndex(index);

		// Then fetch the associated item
		return this->items[index];
	}

	/**
	Adds an item to the end of the list.

	@param item the thing to be added.
	*/
	template <class T>
	void List<T>::add_Item(T item)
	{
		// Check if there is sufficient capacity
		if (this->end < this->capacity - 1)
		{
			// ... and we can append and exit early.
			this->items[this->end++] = item;
			return;
		}

		// Otherwise make a buffer twice the size of the current one.
		T* newItems = this->CreateBuffer(this->capacity * 2);
		
		// Copy the items into the new buffer
		memcpy(newItems, this->items, this->capacity - 1);
		
		// Release the memory from the smaller list
		free(this->items);

		// Update the items pointer and capacity information
		this->items = newItems;
		this->capacity *= 2;

		// Finally call add_Item() to actually append the record
		this->add_Item(item);
	}
};