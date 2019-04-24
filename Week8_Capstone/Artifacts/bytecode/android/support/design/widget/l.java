final class android.support.design.widget.l {
  android.animation.ValueAnimator a;

  android.support.design.widget.l();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #23                 // class java/util/ArrayList
       8: dup
       9: invokespecial #24                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #26                 // Field b:Ljava/util/ArrayList;
      15: aload_0
      16: aconst_null
      17: putfield      #28                 // Field c:Landroid/support/design/widget/l$a;
      20: aload_0
      21: aconst_null
      22: putfield      #30                 // Field a:Landroid/animation/ValueAnimator;
      25: aload_0
      26: new           #6                  // class android/support/design/widget/l$1
      29: dup
      30: aload_0
      31: invokespecial #33                 // Method android/support/design/widget/l$1."<init>":(Landroid/support/design/widget/l;)V
      34: putfield      #35                 // Field d:Landroid/animation/Animator$AnimatorListener;
      37: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #30                 // Field a:Landroid/animation/ValueAnimator;
       4: ifnull        19
       7: aload_0
       8: getfield      #30                 // Field a:Landroid/animation/ValueAnimator;
      11: invokevirtual #50                 // Method android/animation/ValueAnimator.end:()V
      14: aload_0
      15: aconst_null
      16: putfield      #30                 // Field a:Landroid/animation/ValueAnimator;
      19: return

  void a(int[]);
    Code:
       0: aload_0
       1: getfield      #26                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #55                 // Method java/util/ArrayList.size:()I
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iload_2
      11: iload_3
      12: if_icmpge     53
      15: aload_0
      16: getfield      #26                 // Field b:Ljava/util/ArrayList;
      19: iload_2
      20: invokevirtual #59                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      23: checkcast     #8                  // class android/support/design/widget/l$a
      26: astore        4
      28: aload         4
      30: getfield      #62                 // Field android/support/design/widget/l$a.a:[I
      33: aload_1
      34: invokestatic  #68                 // Method android/util/StateSet.stateSetMatches:([I[I)Z
      37: ifeq          46
      40: aload         4
      42: astore_1
      43: goto          55
      46: iload_2
      47: iconst_1
      48: iadd
      49: istore_2
      50: goto          10
      53: aconst_null
      54: astore_1
      55: aload_1
      56: aload_0
      57: getfield      #28                 // Field c:Landroid/support/design/widget/l$a;
      60: if_acmpne     64
      63: return
      64: aload_0
      65: getfield      #28                 // Field c:Landroid/support/design/widget/l$a;
      68: ifnull        75
      71: aload_0
      72: invokespecial #70                 // Method b:()V
      75: aload_0
      76: aload_1
      77: putfield      #28                 // Field c:Landroid/support/design/widget/l$a;
      80: aload_1
      81: ifnull        89
      84: aload_0
      85: aload_1
      86: invokespecial #72                 // Method a:(Landroid/support/design/widget/l$a;)V
      89: return

  public void a(int[], android.animation.ValueAnimator);
    Code:
       0: new           #8                  // class android/support/design/widget/l$a
       3: dup
       4: aload_1
       5: aload_2
       6: invokespecial #75                 // Method android/support/design/widget/l$a."<init>":([ILandroid/animation/ValueAnimator;)V
       9: astore_1
      10: aload_2
      11: aload_0
      12: getfield      #35                 // Field d:Landroid/animation/Animator$AnimatorListener;
      15: invokevirtual #79                 // Method android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
      18: aload_0
      19: getfield      #26                 // Field b:Ljava/util/ArrayList;
      22: aload_1
      23: invokevirtual #83                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      26: pop
      27: return
}
