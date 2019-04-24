public abstract class android.support.v4.view.q {
  public static final int POSITION_NONE;

  public static final int POSITION_UNCHANGED;

  public android.support.v4.view.q();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #19                 // class android/database/DataSetObservable
       8: dup
       9: invokespecial #20                 // Method android/database/DataSetObservable."<init>":()V
      12: putfield      #22                 // Field mObservable:Landroid/database/DataSetObservable;
      15: return

  public void destroyItem(android.view.View, int, java.lang.Object);
    Code:
       0: new           #28                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #30                 // String Required method destroyItem was not overridden
       6: invokespecial #33                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow

  public void destroyItem(android.view.ViewGroup, int, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: invokevirtual #37                 // Method destroyItem:(Landroid/view/View;ILjava/lang/Object;)V
       7: return

  public void finishUpdate(android.view.View);
    Code:
       0: return

  public void finishUpdate(android.view.ViewGroup);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #42                 // Method finishUpdate:(Landroid/view/View;)V
       5: return

  public abstract int getCount();

  public int getItemPosition(java.lang.Object);
    Code:
       0: iconst_m1
       1: ireturn

  public java.lang.CharSequence getPageTitle(int);
    Code:
       0: aconst_null
       1: areturn

  public float getPageWidth(int);
    Code:
       0: fconst_1
       1: freturn

  public java.lang.Object instantiateItem(android.view.View, int);
    Code:
       0: new           #28                 // class java/lang/UnsupportedOperationException
       3: dup
       4: ldc           #54                 // String Required method instantiateItem was not overridden
       6: invokespecial #33                 // Method java/lang/UnsupportedOperationException."<init>":(Ljava/lang/String;)V
       9: athrow

  public java.lang.Object instantiateItem(android.view.ViewGroup, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokevirtual #57                 // Method instantiateItem:(Landroid/view/View;I)Ljava/lang/Object;
       6: areturn

  public abstract boolean isViewFromObject(android.view.View, java.lang.Object);

  public void notifyDataSetChanged();
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #62                 // Field mViewPagerObserver:Landroid/database/DataSetObserver;
       6: ifnull        16
       9: aload_0
      10: getfield      #62                 // Field mViewPagerObserver:Landroid/database/DataSetObserver;
      13: invokevirtual #67                 // Method android/database/DataSetObserver.onChanged:()V
      16: aload_0
      17: monitorexit
      18: aload_0
      19: getfield      #22                 // Field mObservable:Landroid/database/DataSetObservable;
      22: invokevirtual #70                 // Method android/database/DataSetObservable.notifyChanged:()V
      25: return
      26: astore_1
      27: aload_0
      28: monitorexit
      29: aload_1
      30: athrow
    Exception table:
       from    to  target type
           2    16    26   any
          16    18    26   any
          27    29    26   any

  public void registerDataSetObserver(android.database.DataSetObserver);
    Code:
       0: aload_0
       1: getfield      #22                 // Field mObservable:Landroid/database/DataSetObservable;
       4: aload_1
       5: invokevirtual #76                 // Method android/database/DataSetObservable.registerObserver:(Ljava/lang/Object;)V
       8: return

  public void restoreState(android.os.Parcelable, java.lang.ClassLoader);
    Code:
       0: return

  public android.os.Parcelable saveState();
    Code:
       0: aconst_null
       1: areturn

  public void setPrimaryItem(android.view.View, int, java.lang.Object);
    Code:
       0: return

  public void setPrimaryItem(android.view.ViewGroup, int, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: aload_3
       4: invokevirtual #83                 // Method setPrimaryItem:(Landroid/view/View;ILjava/lang/Object;)V
       7: return

  void setViewPagerObserver(android.database.DataSetObserver);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: aload_1
       4: putfield      #62                 // Field mViewPagerObserver:Landroid/database/DataSetObserver;
       7: aload_0
       8: monitorexit
       9: return
      10: astore_1
      11: aload_0
      12: monitorexit
      13: aload_1
      14: athrow
    Exception table:
       from    to  target type
           2     9    10   any
          11    13    10   any

  public void startUpdate(android.view.View);
    Code:
       0: return

  public void startUpdate(android.view.ViewGroup);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #87                 // Method startUpdate:(Landroid/view/View;)V
       5: return

  public void unregisterDataSetObserver(android.database.DataSetObserver);
    Code:
       0: aload_0
       1: getfield      #22                 // Field mObservable:Landroid/database/DataSetObservable;
       4: aload_1
       5: invokevirtual #91                 // Method android/database/DataSetObservable.unregisterObserver:(Ljava/lang/Object;)V
       8: return
}
