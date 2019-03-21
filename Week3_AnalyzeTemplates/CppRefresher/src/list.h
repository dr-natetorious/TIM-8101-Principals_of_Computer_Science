#ifdef __cplusplus
extern "C"
{
#endif
	namespace Nate
	{
		class List {
			private:
				int* items;
				int capacity;
				int end;

				void CheckIndex(int index);

				int* CreateBuffer(int size);

			public:
				List(int capacity);
				List();

				int get_Item(int index);
				void add_Item(int item);
		};
	}
#ifdef __cplusplus
}
#endif