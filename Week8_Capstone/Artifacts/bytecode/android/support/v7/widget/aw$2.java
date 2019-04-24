class android.support.v7.widget.aw$2 implements android.widget.AdapterView$OnItemSelectedListener {
  final android.support.v7.widget.aw a;

  android.support.v7.widget.aw$2(android.support.v7.widget.aw);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v7/widget/aw;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onItemSelected(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: iload_3
       1: iconst_m1
       2: if_icmpeq     22
       5: aload_0
       6: getfield      #17                 // Field a:Landroid/support/v7/widget/aw;
       9: getfield      #27                 // Field android/support/v7/widget/aw.c:Landroid/support/v7/widget/ap;
      12: astore_1
      13: aload_1
      14: ifnull        22
      17: aload_1
      18: iconst_0
      19: invokevirtual #33                 // Method android/support/v7/widget/ap.setListSelectionHidden:(Z)V
      22: return

  public void onNothingSelected(android.widget.AdapterView<?>);
    Code:
       0: return
}
