class android.support.v4.widget.e extends android.widget.Filter {
  android.support.v4.widget.e$a a;

  android.support.v4.widget.e(android.support.v4.widget.e$a);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/widget/Filter."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #15                 // Field a:Landroid/support/v4/widget/e$a;
       9: return

  public java.lang.CharSequence convertResultToString(java.lang.Object);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/widget/e$a;
       4: aload_1
       5: checkcast     #20                 // class android/database/Cursor
       8: invokeinterface #24,  2           // InterfaceMethod android/support/v4/widget/e$a.c:(Landroid/database/Cursor;)Ljava/lang/CharSequence;
      13: areturn

  protected android.widget.Filter$FilterResults performFiltering(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/widget/e$a;
       4: aload_1
       5: invokeinterface #29,  2           // InterfaceMethod android/support/v4/widget/e$a.a:(Ljava/lang/CharSequence;)Landroid/database/Cursor;
      10: astore_1
      11: new           #31                 // class android/widget/Filter$FilterResults
      14: dup
      15: invokespecial #32                 // Method android/widget/Filter$FilterResults."<init>":()V
      18: astore_2
      19: aload_1
      20: ifnull        40
      23: aload_2
      24: aload_1
      25: invokeinterface #36,  1           // InterfaceMethod android/database/Cursor.getCount:()I
      30: putfield      #40                 // Field android/widget/Filter$FilterResults.count:I
      33: aload_2
      34: aload_1
      35: putfield      #44                 // Field android/widget/Filter$FilterResults.values:Ljava/lang/Object;
      38: aload_2
      39: areturn
      40: aload_2
      41: iconst_0
      42: putfield      #40                 // Field android/widget/Filter$FilterResults.count:I
      45: aconst_null
      46: astore_1
      47: goto          33

  protected void publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/widget/e$a;
       4: invokeinterface #49,  1           // InterfaceMethod android/support/v4/widget/e$a.a:()Landroid/database/Cursor;
       9: astore_1
      10: aload_2
      11: getfield      #44                 // Field android/widget/Filter$FilterResults.values:Ljava/lang/Object;
      14: ifnull        41
      17: aload_2
      18: getfield      #44                 // Field android/widget/Filter$FilterResults.values:Ljava/lang/Object;
      21: aload_1
      22: if_acmpeq     41
      25: aload_0
      26: getfield      #15                 // Field a:Landroid/support/v4/widget/e$a;
      29: aload_2
      30: getfield      #44                 // Field android/widget/Filter$FilterResults.values:Ljava/lang/Object;
      33: checkcast     #20                 // class android/database/Cursor
      36: invokeinterface #52,  2           // InterfaceMethod android/support/v4/widget/e$a.a:(Landroid/database/Cursor;)V
      41: return
}
