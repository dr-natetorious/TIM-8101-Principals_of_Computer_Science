class android.support.v4.widget.d$b extends android.database.DataSetObserver {
  final android.support.v4.widget.d a;

  android.support.v4.widget.d$b(android.support.v4.widget.d);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #13                 // Field a:Landroid/support/v4/widget/d;
       5: aload_0
       6: invokespecial #16                 // Method android/database/DataSetObserver."<init>":()V
       9: return

  public void onChanged();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/widget/d;
       4: iconst_1
       5: putfield      #21                 // Field android/support/v4/widget/d.a:Z
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v4/widget/d;
      12: invokevirtual #24                 // Method android/support/v4/widget/d.notifyDataSetChanged:()V
      15: return

  public void onInvalidated();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/support/v4/widget/d;
       4: iconst_0
       5: putfield      #21                 // Field android/support/v4/widget/d.a:Z
       8: aload_0
       9: getfield      #13                 // Field a:Landroid/support/v4/widget/d;
      12: invokevirtual #28                 // Method android/support/v4/widget/d.notifyDataSetInvalidated:()V
      15: return
}
