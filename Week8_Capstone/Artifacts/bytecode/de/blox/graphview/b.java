public abstract class de.blox.graphview.b<VH extends de.blox.graphview.m> implements de.blox.graphview.f<VH> {
  public de.blox.graphview.b(de.blox.graphview.e);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #20                 // class android/database/DataSetObservable
       8: dup
       9: invokespecial #21                 // Method android/database/DataSetObservable."<init>":()V
      12: putfield      #23                 // Field c:Landroid/database/DataSetObservable;
      15: aload_0
      16: aload_1
      17: invokevirtual #25                 // Method a:(Lde/blox/graphview/e;)V
      20: return

  public de.blox.graphview.h a(int);
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lde/blox/graphview/e;
       4: ifnull        16
       7: aload_0
       8: getfield      #29                 // Field a:Lde/blox/graphview/e;
      11: iload_1
      12: invokevirtual #33                 // Method de/blox/graphview/e.a:(I)Lde/blox/graphview/h;
      15: areturn
      16: aconst_null
      17: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lde/blox/graphview/e;
       4: ifnull        30
       7: aload_0
       8: getfield      #29                 // Field a:Lde/blox/graphview/e;
      11: invokevirtual #36                 // Method de/blox/graphview/e.a:()I
      14: ifle          30
      17: aload_0
      18: invokevirtual #39                 // Method b:()Lde/blox/graphview/a;
      21: aload_0
      22: getfield      #29                 // Field a:Lde/blox/graphview/e;
      25: invokeinterface #42,  2           // InterfaceMethod de/blox/graphview/a.a:(Lde/blox/graphview/e;)V
      30: return

  public void a(de.blox.graphview.a);
    Code:
       0: aload_1
       1: ldc           #45                 // String algorithm can't be null
       3: invokestatic  #50                 // Method de/blox/graphview/c.a:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
       6: pop
       7: aload_0
       8: aload_1
       9: putfield      #52                 // Field b:Lde/blox/graphview/a;
      12: aload_0
      13: getfield      #29                 // Field a:Lde/blox/graphview/e;
      16: ifnull        33
      19: aload_0
      20: getfield      #29                 // Field a:Lde/blox/graphview/e;
      23: aload_0
      24: invokevirtual #39                 // Method b:()Lde/blox/graphview/a;
      27: instanceof    #54                 // class de/blox/graphview/b/a
      30: invokevirtual #57                 // Method de/blox/graphview/e.a:(Z)V
      33: return

  public void a(de.blox.graphview.e);
    Code:
       0: aload_1
       1: ldc           #59                 // String graph can't be null
       3: invokestatic  #50                 // Method de/blox/graphview/c.a:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
       6: pop
       7: aload_0
       8: getfield      #29                 // Field a:Lde/blox/graphview/e;
      11: ifnull        22
      14: aload_0
      15: getfield      #29                 // Field a:Lde/blox/graphview/e;
      18: aload_0
      19: invokevirtual #62                 // Method de/blox/graphview/e.b:(Lde/blox/graphview/i;)V
      22: aload_0
      23: aload_1
      24: putfield      #29                 // Field a:Lde/blox/graphview/e;
      27: aload_0
      28: getfield      #29                 // Field a:Lde/blox/graphview/e;
      31: aload_0
      32: invokevirtual #64                 // Method de/blox/graphview/e.a:(Lde/blox/graphview/i;)V
      35: aload_0
      36: getfield      #23                 // Field c:Landroid/database/DataSetObservable;
      39: invokevirtual #67                 // Method android/database/DataSetObservable.notifyChanged:()V
      42: aload_1
      43: aload_0
      44: invokevirtual #39                 // Method b:()Lde/blox/graphview/a;
      47: instanceof    #54                 // class de/blox/graphview/b/a
      50: invokevirtual #57                 // Method de/blox/graphview/e.a:(Z)V
      53: return

  public de.blox.graphview.a b();
    Code:
       0: aload_0
       1: getfield      #52                 // Field b:Lde/blox/graphview/a;
       4: ifnonnull     18
       7: aload_0
       8: new           #54                 // class de/blox/graphview/b/a
      11: dup
      12: invokespecial #68                 // Method de/blox/graphview/b/a."<init>":()V
      15: putfield      #52                 // Field b:Lde/blox/graphview/a;
      18: aload_0
      19: getfield      #52                 // Field b:Lde/blox/graphview/a;
      22: areturn

  public de.blox.graphview.l b(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #70                 // Method a:(I)Lde/blox/graphview/h;
       5: invokevirtual #75                 // Method de/blox/graphview/h.a:()Lde/blox/graphview/l;
       8: areturn

  public de.blox.graphview.e c();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lde/blox/graphview/e;
       4: areturn

  public void d();
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:Landroid/database/DataSetObservable;
       4: invokevirtual #80                 // Method android/database/DataSetObservable.notifyInvalidated:()V
       7: return

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #29                 // Field a:Lde/blox/graphview/e;
       4: ifnull        15
       7: aload_0
       8: getfield      #29                 // Field a:Lde/blox/graphview/e;
      11: invokevirtual #36                 // Method de/blox/graphview/e.a:()I
      14: ireturn
      15: iconst_0
      16: ireturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #70                 // Method a:(I)Lde/blox/graphview/h;
       5: invokevirtual #86                 // Method de/blox/graphview/h.d:()Ljava/lang/Object;
       8: areturn

  public long getItemId(int);
    Code:
       0: lconst_0
       1: lreturn

  public int getItemViewType(int);
    Code:
       0: iconst_0
       1: ireturn

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_2
       1: ifnonnull     28
       4: aload_0
       5: aload_3
       6: aload_0
       7: iload_1
       8: invokevirtual #94                 // Method getItemViewType:(I)I
      11: invokevirtual #97                 // Method a:(Landroid/view/ViewGroup;I)Lde/blox/graphview/m;
      14: astore_2
      15: aload_2
      16: getfield      #102                // Field de/blox/graphview/m.a:Landroid/view/View;
      19: astore_3
      20: aload_3
      21: aload_2
      22: invokevirtual #108                // Method android/view/View.setTag:(Ljava/lang/Object;)V
      25: goto          41
      28: aload_2
      29: invokevirtual #111                // Method android/view/View.getTag:()Ljava/lang/Object;
      32: checkcast     #99                 // class de/blox/graphview/m
      35: astore_2
      36: aload_2
      37: getfield      #102                // Field de/blox/graphview/m.a:Landroid/view/View;
      40: astore_3
      41: aload_0
      42: aload_2
      43: aload_0
      44: iload_1
      45: invokevirtual #70                 // Method a:(I)Lde/blox/graphview/h;
      48: invokevirtual #86                 // Method de/blox/graphview/h.d:()Ljava/lang/Object;
      51: iload_1
      52: invokevirtual #114                // Method a:(Lde/blox/graphview/m;Ljava/lang/Object;I)V
      55: aload_3
      56: areturn

  public int getViewTypeCount();
    Code:
       0: iconst_0
       1: ireturn

  public boolean hasStableIds();
    Code:
       0: iconst_0
       1: ireturn

  public boolean isEmpty();
    Code:
       0: iconst_0
       1: ireturn

  public void registerDataSetObserver(android.database.DataSetObserver);
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:Landroid/database/DataSetObservable;
       4: aload_1
       5: invokevirtual #123                // Method android/database/DataSetObservable.registerObserver:(Ljava/lang/Object;)V
       8: return

  public void unregisterDataSetObserver(android.database.DataSetObserver);
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:Landroid/database/DataSetObservable;
       4: aload_1
       5: invokevirtual #127                // Method android/database/DataSetObservable.unregisterObserver:(Ljava/lang/Object;)V
       8: return
}
