class android.support.v7.widget.bg {
  static int a(android.support.v7.widget.RecyclerView$u, android.support.v7.widget.ba, android.view.View, android.view.View, android.support.v7.widget.RecyclerView$i, boolean);
    Code:
       0: aload         4
       2: invokevirtual #12                 // Method android/support/v7/widget/RecyclerView$i.v:()I
       5: ifeq          77
       8: aload_0
       9: invokevirtual #17                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      12: ifeq          77
      15: aload_2
      16: ifnull        77
      19: aload_3
      20: ifnonnull     26
      23: goto          77
      26: iload         5
      28: ifne          50
      31: aload         4
      33: aload_2
      34: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
      37: aload         4
      39: aload_3
      40: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
      43: isub
      44: invokestatic  #27                 // Method java/lang/Math.abs:(I)I
      47: iconst_1
      48: iadd
      49: ireturn
      50: aload_1
      51: aload_3
      52: invokevirtual #32                 // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
      55: istore        6
      57: aload_1
      58: aload_2
      59: invokevirtual #34                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
      62: istore        7
      64: aload_1
      65: invokevirtual #37                 // Method android/support/v7/widget/ba.f:()I
      68: iload         6
      70: iload         7
      72: isub
      73: invokestatic  #41                 // Method java/lang/Math.min:(II)I
      76: ireturn
      77: iconst_0
      78: ireturn

  static int a(android.support.v7.widget.RecyclerView$u, android.support.v7.widget.ba, android.view.View, android.view.View, android.support.v7.widget.RecyclerView$i, boolean, boolean);
    Code:
       0: aload         4
       2: invokevirtual #12                 // Method android/support/v7/widget/RecyclerView$i.v:()I
       5: ifeq          165
       8: aload_0
       9: invokevirtual #17                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      12: ifeq          165
      15: aload_2
      16: ifnull        165
      19: aload_3
      20: ifnonnull     25
      23: iconst_0
      24: ireturn
      25: aload         4
      27: aload_2
      28: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
      31: aload         4
      33: aload_3
      34: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
      37: invokestatic  #41                 // Method java/lang/Math.min:(II)I
      40: istore        8
      42: aload         4
      44: aload_2
      45: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
      48: aload         4
      50: aload_3
      51: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
      54: invokestatic  #46                 // Method java/lang/Math.max:(II)I
      57: istore        9
      59: iload         6
      61: ifeq          82
      64: iconst_0
      65: aload_0
      66: invokevirtual #17                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      69: iload         9
      71: isub
      72: iconst_1
      73: isub
      74: invokestatic  #46                 // Method java/lang/Math.max:(II)I
      77: istore        8
      79: goto          90
      82: iconst_0
      83: iload         8
      85: invokestatic  #46                 // Method java/lang/Math.max:(II)I
      88: istore        8
      90: iload         5
      92: ifne          98
      95: iload         8
      97: ireturn
      98: aload_1
      99: aload_3
     100: invokevirtual #32                 // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
     103: aload_1
     104: aload_2
     105: invokevirtual #34                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
     108: isub
     109: invokestatic  #27                 // Method java/lang/Math.abs:(I)I
     112: istore        9
     114: aload         4
     116: aload_2
     117: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
     120: aload         4
     122: aload_3
     123: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
     126: isub
     127: invokestatic  #27                 // Method java/lang/Math.abs:(I)I
     130: istore        10
     132: iload         9
     134: i2f
     135: iload         10
     137: iconst_1
     138: iadd
     139: i2f
     140: fdiv
     141: fstore        7
     143: iload         8
     145: i2f
     146: fload         7
     148: fmul
     149: aload_1
     150: invokevirtual #49                 // Method android/support/v7/widget/ba.c:()I
     153: aload_1
     154: aload_2
     155: invokevirtual #34                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
     158: isub
     159: i2f
     160: fadd
     161: invokestatic  #53                 // Method java/lang/Math.round:(F)I
     164: ireturn
     165: iconst_0
     166: ireturn

  static int b(android.support.v7.widget.RecyclerView$u, android.support.v7.widget.ba, android.view.View, android.view.View, android.support.v7.widget.RecyclerView$i, boolean);
    Code:
       0: aload         4
       2: invokevirtual #12                 // Method android/support/v7/widget/RecyclerView$i.v:()I
       5: ifeq          88
       8: aload_0
       9: invokevirtual #17                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      12: ifeq          88
      15: aload_2
      16: ifnull        88
      19: aload_3
      20: ifnonnull     26
      23: goto          88
      26: iload         5
      28: ifne          36
      31: aload_0
      32: invokevirtual #17                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      35: ireturn
      36: aload_1
      37: aload_3
      38: invokevirtual #32                 // Method android/support/v7/widget/ba.b:(Landroid/view/View;)I
      41: istore        6
      43: aload_1
      44: aload_2
      45: invokevirtual #34                 // Method android/support/v7/widget/ba.a:(Landroid/view/View;)I
      48: istore        7
      50: aload         4
      52: aload_2
      53: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
      56: aload         4
      58: aload_3
      59: invokevirtual #21                 // Method android/support/v7/widget/RecyclerView$i.d:(Landroid/view/View;)I
      62: isub
      63: invokestatic  #27                 // Method java/lang/Math.abs:(I)I
      66: istore        8
      68: iload         6
      70: iload         7
      72: isub
      73: i2f
      74: iload         8
      76: iconst_1
      77: iadd
      78: i2f
      79: fdiv
      80: aload_0
      81: invokevirtual #17                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      84: i2f
      85: fmul
      86: f2i
      87: ireturn
      88: iconst_0
      89: ireturn
}
