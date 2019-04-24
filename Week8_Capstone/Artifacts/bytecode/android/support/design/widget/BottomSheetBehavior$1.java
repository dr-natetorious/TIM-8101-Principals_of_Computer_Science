class android.support.design.widget.BottomSheetBehavior$1 extends android.support.v4.widget.p$a {
  final android.support.design.widget.BottomSheetBehavior a;

  android.support.design.widget.BottomSheetBehavior$1(android.support.design.widget.BottomSheetBehavior);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
       5: aload_0
       6: invokespecial #15                 // Method android/support/v4/widget/p$a."<init>":()V
       9: return

  public int a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
       4: getfield      #21                 // Field android/support/design/widget/BottomSheetBehavior.c:Z
       7: ifeq          28
      10: aload_0
      11: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      14: getfield      #25                 // Field android/support/design/widget/BottomSheetBehavior.f:I
      17: istore_2
      18: iload_2
      19: aload_0
      20: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      23: getfield      #27                 // Field android/support/design/widget/BottomSheetBehavior.a:I
      26: isub
      27: ireturn
      28: aload_0
      29: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      32: getfield      #30                 // Field android/support/design/widget/BottomSheetBehavior.b:I
      35: istore_2
      36: goto          18

  public int a(android.view.View, int, int);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
       4: getfield      #27                 // Field android/support/design/widget/BottomSheetBehavior.a:I
       7: istore        4
       9: aload_0
      10: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      13: getfield      #21                 // Field android/support/design/widget/BottomSheetBehavior.c:Z
      16: ifeq          30
      19: aload_0
      20: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      23: getfield      #25                 // Field android/support/design/widget/BottomSheetBehavior.f:I
      26: istore_3
      27: goto          38
      30: aload_0
      31: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      34: getfield      #30                 // Field android/support/design/widget/BottomSheetBehavior.b:I
      37: istore_3
      38: iload_2
      39: iload         4
      41: iload_3
      42: invokestatic  #36                 // Method android/support/v4/d/a.a:(III)I
      45: ireturn

  public void a(int);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpne     13
       5: aload_0
       6: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
       9: iconst_1
      10: invokevirtual #39                 // Method android/support/design/widget/BottomSheetBehavior.b:(I)V
      13: return

  public void a(android.view.View, float, float);
    Code:
       0: iconst_4
       1: istore        4
       3: fload_3
       4: fconst_0
       5: fcmpg
       6: ifge          24
       9: aload_0
      10: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      13: getfield      #27                 // Field android/support/design/widget/BottomSheetBehavior.a:I
      16: istore        5
      18: iconst_3
      19: istore        4
      21: goto          114
      24: aload_0
      25: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      28: getfield      #21                 // Field android/support/design/widget/BottomSheetBehavior.c:Z
      31: ifeq          61
      34: aload_0
      35: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      38: aload_1
      39: fload_3
      40: invokevirtual #43                 // Method android/support/design/widget/BottomSheetBehavior.a:(Landroid/view/View;F)Z
      43: ifeq          61
      46: aload_0
      47: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      50: getfield      #25                 // Field android/support/design/widget/BottomSheetBehavior.f:I
      53: istore        5
      55: iconst_5
      56: istore        4
      58: goto          114
      61: fload_3
      62: fconst_0
      63: fcmpl
      64: ifne          105
      67: aload_1
      68: invokevirtual #49                 // Method android/view/View.getTop:()I
      71: istore        5
      73: iload         5
      75: aload_0
      76: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      79: getfield      #27                 // Field android/support/design/widget/BottomSheetBehavior.a:I
      82: isub
      83: invokestatic  #55                 // Method java/lang/Math.abs:(I)I
      86: iload         5
      88: aload_0
      89: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      92: getfield      #30                 // Field android/support/design/widget/BottomSheetBehavior.b:I
      95: isub
      96: invokestatic  #55                 // Method java/lang/Math.abs:(I)I
      99: if_icmpge     105
     102: goto          9
     105: aload_0
     106: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
     109: getfield      #30                 // Field android/support/design/widget/BottomSheetBehavior.b:I
     112: istore        5
     114: aload_0
     115: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
     118: getfield      #59                 // Field android/support/design/widget/BottomSheetBehavior.e:Landroid/support/v4/widget/p;
     121: aload_1
     122: invokevirtual #62                 // Method android/view/View.getLeft:()I
     125: iload         5
     127: invokevirtual #67                 // Method android/support/v4/widget/p.a:(II)Z
     130: ifeq          160
     133: aload_0
     134: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
     137: iconst_2
     138: invokevirtual #39                 // Method android/support/design/widget/BottomSheetBehavior.b:(I)V
     141: aload_1
     142: new           #69                 // class android/support/design/widget/BottomSheetBehavior$c
     145: dup
     146: aload_0
     147: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
     150: aload_1
     151: iload         4
     153: invokespecial #72                 // Method android/support/design/widget/BottomSheetBehavior$c."<init>":(Landroid/support/design/widget/BottomSheetBehavior;Landroid/view/View;I)V
     156: invokestatic  #77                 // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
     159: return
     160: aload_0
     161: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
     164: iload         4
     166: invokevirtual #39                 // Method android/support/design/widget/BottomSheetBehavior.b:(I)V
     169: return

  public void a(android.view.View, int, int, int, int);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
       4: iload_3
       5: invokevirtual #80                 // Method android/support/design/widget/BottomSheetBehavior.c:(I)V
       8: return

  public boolean a(android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
       4: getfield      #84                 // Field android/support/design/widget/BottomSheetBehavior.d:I
       7: iconst_1
       8: if_icmpne     13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      17: getfield      #87                 // Field android/support/design/widget/BottomSheetBehavior.j:Z
      20: ifeq          25
      23: iconst_0
      24: ireturn
      25: aload_0
      26: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      29: getfield      #84                 // Field android/support/design/widget/BottomSheetBehavior.d:I
      32: iconst_3
      33: if_icmpne     75
      36: aload_0
      37: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      40: getfield      #90                 // Field android/support/design/widget/BottomSheetBehavior.i:I
      43: iload_2
      44: if_icmpne     75
      47: aload_0
      48: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      51: getfield      #94                 // Field android/support/design/widget/BottomSheetBehavior.h:Ljava/lang/ref/WeakReference;
      54: invokevirtual #100                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      57: checkcast     #45                 // class android/view/View
      60: astore_3
      61: aload_3
      62: ifnull        75
      65: aload_3
      66: iconst_m1
      67: invokevirtual #104                // Method android/view/View.canScrollVertically:(I)Z
      70: ifeq          75
      73: iconst_0
      74: ireturn
      75: aload_0
      76: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      79: getfield      #107                // Field android/support/design/widget/BottomSheetBehavior.g:Ljava/lang/ref/WeakReference;
      82: ifnull        101
      85: aload_0
      86: getfield      #12                 // Field a:Landroid/support/design/widget/BottomSheetBehavior;
      89: getfield      #107                // Field android/support/design/widget/BottomSheetBehavior.g:Ljava/lang/ref/WeakReference;
      92: invokevirtual #100                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      95: aload_1
      96: if_acmpne     101
      99: iconst_1
     100: ireturn
     101: iconst_0
     102: ireturn

  public int b(android.view.View, int, int);
    Code:
       0: aload_1
       1: invokevirtual #62                 // Method android/view/View.getLeft:()I
       4: ireturn
}
