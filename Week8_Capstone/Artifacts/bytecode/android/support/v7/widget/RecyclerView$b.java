class android.support.v7.widget.RecyclerView$b extends android.database.Observable<android.support.v7.widget.RecyclerView$c> {
  android.support.v7.widget.RecyclerView$b();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method android/database/Observable."<init>":()V
       4: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
       4: invokevirtual #24                 // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_1
      10: iload_1
      11: iflt          35
      14: aload_0
      15: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
      18: iload_1
      19: invokevirtual #28                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #30                 // class android/support/v7/widget/RecyclerView$c
      25: invokevirtual #32                 // Method android/support/v7/widget/RecyclerView$c.a:()V
      28: iload_1
      29: iconst_1
      30: isub
      31: istore_1
      32: goto          10
      35: return

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
       4: invokevirtual #24                 // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_3
      10: iload_3
      11: iflt          37
      14: aload_0
      15: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
      18: iload_3
      19: invokevirtual #28                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #30                 // class android/support/v7/widget/RecyclerView$c
      25: iload_1
      26: iload_2
      27: invokevirtual #35                 // Method android/support/v7/widget/RecyclerView$c.b:(II)V
      30: iload_3
      31: iconst_1
      32: isub
      33: istore_3
      34: goto          10
      37: return

  public void a(int, int, java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
       4: invokevirtual #24                 // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore        4
      11: iload         4
      13: iflt          43
      16: aload_0
      17: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
      20: iload         4
      22: invokevirtual #28                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      25: checkcast     #30                 // class android/support/v7/widget/RecyclerView$c
      28: iload_1
      29: iload_2
      30: aload_3
      31: invokevirtual #38                 // Method android/support/v7/widget/RecyclerView$c.a:(IILjava/lang/Object;)V
      34: iload         4
      36: iconst_1
      37: isub
      38: istore        4
      40: goto          11
      43: return

  public void b(int, int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
       4: invokevirtual #24                 // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_3
      10: iload_3
      11: iflt          37
      14: aload_0
      15: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
      18: iload_3
      19: invokevirtual #28                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #30                 // class android/support/v7/widget/RecyclerView$c
      25: iload_1
      26: iload_2
      27: invokevirtual #41                 // Method android/support/v7/widget/RecyclerView$c.c:(II)V
      30: iload_3
      31: iconst_1
      32: isub
      33: istore_3
      34: goto          10
      37: return

  public void c(int, int);
    Code:
       0: aload_0
       1: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
       4: invokevirtual #24                 // Method java/util/ArrayList.size:()I
       7: iconst_1
       8: isub
       9: istore_3
      10: iload_3
      11: iflt          38
      14: aload_0
      15: getfield      #18                 // Field mObservers:Ljava/util/ArrayList;
      18: iload_3
      19: invokevirtual #28                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      22: checkcast     #30                 // class android/support/v7/widget/RecyclerView$c
      25: iload_1
      26: iload_2
      27: iconst_1
      28: invokevirtual #44                 // Method android/support/v7/widget/RecyclerView$c.a:(III)V
      31: iload_3
      32: iconst_1
      33: isub
      34: istore_3
      35: goto          10
      38: return
}
