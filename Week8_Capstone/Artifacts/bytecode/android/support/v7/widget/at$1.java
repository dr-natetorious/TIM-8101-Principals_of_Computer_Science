final class android.support.v7.widget.at$1 implements java.util.Comparator<android.support.v7.widget.at$b> {
  android.support.v7.widget.at$1();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/lang/Object."<init>":()V
       4: return

  public int a(android.support.v7.widget.at$b, android.support.v7.widget.at$b);
    Code:
       0: aload_1
       1: getfield      #22                 // Field android/support/v7/widget/at$b.d:Landroid/support/v7/widget/RecyclerView;
       4: astore        6
       6: iconst_1
       7: istore        5
       9: aload         6
      11: ifnonnull     19
      14: iconst_1
      15: istore_3
      16: goto          21
      19: iconst_0
      20: istore_3
      21: aload_2
      22: getfield      #22                 // Field android/support/v7/widget/at$b.d:Landroid/support/v7/widget/RecyclerView;
      25: ifnonnull     34
      28: iconst_1
      29: istore        4
      31: goto          37
      34: iconst_0
      35: istore        4
      37: iload_3
      38: iload         4
      40: if_icmpeq     54
      43: aload_1
      44: getfield      #22                 // Field android/support/v7/widget/at$b.d:Landroid/support/v7/widget/RecyclerView;
      47: ifnonnull     52
      50: iconst_1
      51: ireturn
      52: iconst_m1
      53: ireturn
      54: aload_1
      55: getfield      #25                 // Field android/support/v7/widget/at$b.a:Z
      58: aload_2
      59: getfield      #25                 // Field android/support/v7/widget/at$b.a:Z
      62: if_icmpeq     79
      65: iload         5
      67: istore_3
      68: aload_1
      69: getfield      #25                 // Field android/support/v7/widget/at$b.a:Z
      72: ifeq          77
      75: iconst_m1
      76: istore_3
      77: iload_3
      78: ireturn
      79: aload_2
      80: getfield      #29                 // Field android/support/v7/widget/at$b.b:I
      83: aload_1
      84: getfield      #29                 // Field android/support/v7/widget/at$b.b:I
      87: isub
      88: istore_3
      89: iload_3
      90: ifeq          95
      93: iload_3
      94: ireturn
      95: aload_1
      96: getfield      #32                 // Field android/support/v7/widget/at$b.c:I
      99: aload_2
     100: getfield      #32                 // Field android/support/v7/widget/at$b.c:I
     103: isub
     104: istore_3
     105: iload_3
     106: ifeq          111
     109: iload_3
     110: ireturn
     111: iconst_0
     112: ireturn

  public int compare(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #18                 // class android/support/v7/widget/at$b
       5: aload_2
       6: checkcast     #18                 // class android/support/v7/widget/at$b
       9: invokevirtual #36                 // Method a:(Landroid/support/v7/widget/at$b;Landroid/support/v7/widget/at$b;)I
      12: ireturn
}
