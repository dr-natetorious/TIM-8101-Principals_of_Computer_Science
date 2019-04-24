public class android.support.v4.widget.i extends android.support.v4.widget.a {
  public android.support.v4.widget.i(android.widget.ListView);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #11                 // Method android/support/v4/widget/a."<init>":(Landroid/view/View;)V
       5: aload_0
       6: aload_1
       7: putfield      #13                 // Field f:Landroid/widget/ListView;
      10: return

  public void a(int, int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field f:Landroid/widget/ListView;
       4: iload_2
       5: invokestatic  #21                 // Method android/support/v4/widget/j.a:(Landroid/widget/ListView;I)V
       8: return

  public boolean e(int);
    Code:
       0: iconst_0
       1: ireturn

  public boolean f(int);
    Code:
       0: aload_0
       1: getfield      #13                 // Field f:Landroid/widget/ListView;
       4: astore        5
       6: aload         5
       8: invokevirtual #29                 // Method android/widget/ListView.getCount:()I
      11: istore_2
      12: iload_2
      13: ifne          18
      16: iconst_0
      17: ireturn
      18: aload         5
      20: invokevirtual #32                 // Method android/widget/ListView.getChildCount:()I
      23: istore_3
      24: aload         5
      26: invokevirtual #35                 // Method android/widget/ListView.getFirstVisiblePosition:()I
      29: istore        4
      31: iload_1
      32: ifle          64
      35: iload         4
      37: iload_3
      38: iadd
      39: iload_2
      40: if_icmplt     87
      43: aload         5
      45: iload_3
      46: iconst_1
      47: isub
      48: invokevirtual #39                 // Method android/widget/ListView.getChildAt:(I)Landroid/view/View;
      51: invokevirtual #44                 // Method android/view/View.getBottom:()I
      54: aload         5
      56: invokevirtual #47                 // Method android/widget/ListView.getHeight:()I
      59: if_icmpgt     87
      62: iconst_0
      63: ireturn
      64: iload_1
      65: ifge          89
      68: iload         4
      70: ifgt          87
      73: aload         5
      75: iconst_0
      76: invokevirtual #39                 // Method android/widget/ListView.getChildAt:(I)Landroid/view/View;
      79: invokevirtual #50                 // Method android/view/View.getTop:()I
      82: iflt          87
      85: iconst_0
      86: ireturn
      87: iconst_1
      88: ireturn
      89: iconst_0
      90: ireturn
}
