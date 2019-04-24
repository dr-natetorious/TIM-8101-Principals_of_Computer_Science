class android.support.v4.view.v$h extends android.database.DataSetObserver {
  final android.support.v4.view.v a;

  android.support.v4.view.v$h(android.support.v4.view.v);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v4/view/v;
       5: aload_0
       6: invokespecial #16                 // Method android/database/DataSetObserver."<init>":()V
       9: return

  public void onChanged();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/view/v;
       4: invokevirtual #21                 // Method android/support/v4/view/v.dataSetChanged:()V
       7: return

  public void onInvalidated();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/view/v;
       4: invokevirtual #21                 // Method android/support/v4/view/v.dataSetChanged:()V
       7: return
}
