public class ryey.easer.plugins.event.i.d extends ryey.easer.plugins.c<ryey.easer.plugins.event.i.a> {
  public ryey.easer.plugins.event.i.d();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method ryey/easer/plugins/c."<init>":()V
       4: aload_0
       5: bipush        7
       7: anewarray     #13                 // class android/widget/CompoundButton
      10: putfield      #15                 // Field a:[Landroid/widget/CompoundButton;
      13: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #21                 // Method b:()Lryey/easer/plugins/event/i/a;
       4: areturn

  protected void a(ryey.easer.plugins.event.i.a);
    Code:
       0: aload_1
       1: getfield      #27                 // Field ryey/easer/plugins/event/i/a.a:Ljava/util/Set;
       4: invokeinterface #33,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       9: astore_1
      10: aload_1
      11: invokeinterface #39,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          45
      19: aload_1
      20: invokeinterface #43,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #45                 // class java/lang/Integer
      28: invokevirtual #49                 // Method java/lang/Integer.intValue:()I
      31: istore_2
      32: aload_0
      33: getfield      #15                 // Field a:[Landroid/widget/CompoundButton;
      36: iload_2
      37: aaload
      38: iconst_1
      39: invokevirtual #53                 // Method android/widget/CompoundButton.setChecked:(Z)V
      42: goto          10
      45: return

  public ryey.easer.plugins.event.i.a b();
    Code:
       0: new           #55                 // class java/util/HashSet
       3: dup
       4: invokespecial #56                 // Method java/util/HashSet."<init>":()V
       7: astore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: bipush        7
      13: if_icmpge     46
      16: aload_0
      17: getfield      #15                 // Field a:[Landroid/widget/CompoundButton;
      20: iload_1
      21: aaload
      22: invokevirtual #59                 // Method android/widget/CompoundButton.isChecked:()Z
      25: ifeq          39
      28: aload_2
      29: iload_1
      30: invokestatic  #63                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      33: invokeinterface #67,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      38: pop
      39: iload_1
      40: iconst_1
      41: iadd
      42: istore_1
      43: goto          10
      46: new           #24                 // class ryey/easer/plugins/event/i/a
      49: dup
      50: aload_2
      51: invokespecial #70                 // Method ryey/easer/plugins/event/i/a."<init>":(Ljava/util/Set;)V
      54: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #24                 // class ryey/easer/plugins/event/i/a
       5: invokevirtual #73                 // Method a:(Lryey/easer/plugins/event/i/a;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: iconst_0
       1: istore        4
       3: aload_1
       4: ldc           #76                 // int 2131427435
       6: aload_2
       7: iconst_0
       8: invokevirtual #82                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      11: astore_1
      12: aload_1
      13: ldc           #83                 // int 2131296514
      15: invokevirtual #89                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      18: checkcast     #91                 // class android/view/ViewGroup
      21: astore_2
      22: new           #93                 // class java/text/SimpleDateFormat
      25: dup
      26: ldc           #95                 // String E
      28: invokestatic  #101                // Method java/util/Locale.getDefault:()Ljava/util/Locale;
      31: invokespecial #104                // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      34: astore_3
      35: invokestatic  #110                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      38: astore        5
      40: iload         4
      42: bipush        7
      44: if_icmpge     117
      47: aload_2
      48: iload         4
      50: invokevirtual #113                // Method android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
      53: checkcast     #115                // class android/widget/ToggleButton
      56: astore        6
      58: aload_0
      59: getfield      #15                 // Field a:[Landroid/widget/CompoundButton;
      62: iload         4
      64: aload         6
      66: aastore
      67: iload         4
      69: iconst_1
      70: iadd
      71: istore        4
      73: aload         5
      75: bipush        7
      77: iload         4
      79: invokevirtual #119                // Method java/util/Calendar.set:(II)V
      82: aload_3
      83: aload         5
      85: invokevirtual #123                // Method java/util/Calendar.getTime:()Ljava/util/Date;
      88: invokevirtual #127                // Method java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
      91: astore        7
      93: aload         6
      95: aload         7
      97: invokevirtual #131                // Method android/widget/ToggleButton.setText:(Ljava/lang/CharSequence;)V
     100: aload         6
     102: aload         7
     104: invokevirtual #134                // Method android/widget/ToggleButton.setTextOn:(Ljava/lang/CharSequence;)V
     107: aload         6
     109: aload         7
     111: invokevirtual #137                // Method android/widget/ToggleButton.setTextOff:(Ljava/lang/CharSequence;)V
     114: goto          40
     117: aload_1
     118: areturn
}
