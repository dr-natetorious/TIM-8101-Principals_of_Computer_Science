class android.support.v7.widget.aw$b extends android.database.DataSetObserver {
  final android.support.v7.widget.aw a;

  android.support.v7.widget.aw$b(android.support.v7.widget.aw);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v7/widget/aw;
       5: aload_0
       6: invokespecial #16                 // Method android/database/DataSetObserver."<init>":()V
       9: return

  public void onChanged();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/aw;
       4: invokevirtual #22                 // Method android/support/v7/widget/aw.f:()Z
       7: ifeq          17
      10: aload_0
      11: getfield      #13                 // Field a:Landroid/support/v7/widget/aw;
      14: invokevirtual #25                 // Method android/support/v7/widget/aw.d:()V
      17: return

  public void onInvalidated();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v7/widget/aw;
       4: invokevirtual #29                 // Method android/support/v7/widget/aw.e:()V
       7: return
}
