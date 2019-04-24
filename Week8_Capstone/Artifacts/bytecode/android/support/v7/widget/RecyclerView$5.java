class android.support.v7.widget.RecyclerView$5 implements android.support.v7.widget.aj$b {
  final android.support.v7.widget.RecyclerView a;

  android.support.v7.widget.RecyclerView$5(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       5: aload_0
       6: invokespecial #19                 // Method java/lang/Object."<init>":()V
       9: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: invokevirtual #24                 // Method android/support/v7/widget/RecyclerView.getChildCount:()I
       7: ireturn

  public int a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: aload_1
       5: invokevirtual #28                 // Method android/support/v7/widget/RecyclerView.indexOfChild:(Landroid/view/View;)I
       8: ireturn

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: invokevirtual #33                 // Method android/support/v7/widget/RecyclerView.getChildAt:(I)Landroid/view/View;
       8: astore_2
       9: aload_2
      10: ifnull        25
      13: aload_0
      14: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      17: aload_2
      18: invokevirtual #37                 // Method android/support/v7/widget/RecyclerView.m:(Landroid/view/View;)V
      21: aload_2
      22: invokevirtual #42                 // Method android/view/View.clearAnimation:()V
      25: aload_0
      26: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      29: iload_1
      30: invokevirtual #45                 // Method android/support/v7/widget/RecyclerView.removeViewAt:(I)V
      33: return

  public void a(android.view.View, int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: aload_1
       5: iload_2
       6: invokevirtual #49                 // Method android/support/v7/widget/RecyclerView.addView:(Landroid/view/View;I)V
       9: aload_0
      10: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      13: aload_1
      14: invokevirtual #52                 // Method android/support/v7/widget/RecyclerView.n:(Landroid/view/View;)V
      17: return

  public void a(android.view.View, int, android.view.ViewGroup$LayoutParams);
    Code:
       0: aload_1
       1: invokestatic  #57                 // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: astore        4
       6: aload         4
       8: ifnull        78
      11: aload         4
      13: invokevirtual #63                 // Method android/support/v7/widget/RecyclerView$x.r:()Z
      16: ifne          73
      19: aload         4
      21: invokevirtual #66                 // Method android/support/v7/widget/RecyclerView$x.c:()Z
      24: ifne          73
      27: new           #68                 // class java/lang/StringBuilder
      30: dup
      31: invokespecial #69                 // Method java/lang/StringBuilder."<init>":()V
      34: astore_1
      35: aload_1
      36: ldc           #71                 // String Called attach on a child which is not detached:
      38: invokevirtual #75                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      41: pop
      42: aload_1
      43: aload         4
      45: invokevirtual #78                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      48: pop
      49: aload_1
      50: aload_0
      51: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      54: invokevirtual #81                 // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
      57: invokevirtual #75                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      60: pop
      61: new           #83                 // class java/lang/IllegalArgumentException
      64: dup
      65: aload_1
      66: invokevirtual #86                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      69: invokespecial #89                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      72: athrow
      73: aload         4
      75: invokevirtual #91                 // Method android/support/v7/widget/RecyclerView$x.m:()V
      78: aload_0
      79: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      82: aload_1
      83: iload_2
      84: aload_3
      85: invokestatic  #94                 // Method android/support/v7/widget/RecyclerView.a:(Landroid/support/v7/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
      88: return

  public android.support.v7.widget.RecyclerView$x b(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #57                 // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: areturn

  public android.view.View b(int);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
       4: iload_1
       5: invokevirtual #33                 // Method android/support/v7/widget/RecyclerView.getChildAt:(I)Landroid/view/View;
       8: areturn

  public void b();
    Code:
       0: aload_0
       1: invokevirtual #97                 // Method a:()I
       4: istore_2
       5: iconst_0
       6: istore_1
       7: iload_1
       8: iload_2
       9: if_icmpge     37
      12: aload_0
      13: iload_1
      14: invokevirtual #99                 // Method b:(I)Landroid/view/View;
      17: astore_3
      18: aload_0
      19: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      22: aload_3
      23: invokevirtual #37                 // Method android/support/v7/widget/RecyclerView.m:(Landroid/view/View;)V
      26: aload_3
      27: invokevirtual #42                 // Method android/view/View.clearAnimation:()V
      30: iload_1
      31: iconst_1
      32: iadd
      33: istore_1
      34: goto          7
      37: aload_0
      38: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      41: invokevirtual #102                // Method android/support/v7/widget/RecyclerView.removeAllViews:()V
      44: return

  public void c(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #99                 // Method b:(I)Landroid/view/View;
       5: astore_2
       6: aload_2
       7: ifnull        85
      10: aload_2
      11: invokestatic  #57                 // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
      14: astore_2
      15: aload_2
      16: ifnull        85
      19: aload_2
      20: invokevirtual #63                 // Method android/support/v7/widget/RecyclerView$x.r:()Z
      23: ifeq          78
      26: aload_2
      27: invokevirtual #66                 // Method android/support/v7/widget/RecyclerView$x.c:()Z
      30: ifne          78
      33: new           #68                 // class java/lang/StringBuilder
      36: dup
      37: invokespecial #69                 // Method java/lang/StringBuilder."<init>":()V
      40: astore_3
      41: aload_3
      42: ldc           #104                // String called detach on an already detached child
      44: invokevirtual #75                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      47: pop
      48: aload_3
      49: aload_2
      50: invokevirtual #78                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      53: pop
      54: aload_3
      55: aload_0
      56: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      59: invokevirtual #81                 // Method android/support/v7/widget/RecyclerView.a:()Ljava/lang/String;
      62: invokevirtual #75                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      65: pop
      66: new           #83                 // class java/lang/IllegalArgumentException
      69: dup
      70: aload_3
      71: invokevirtual #86                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      74: invokespecial #89                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      77: athrow
      78: aload_2
      79: sipush        256
      82: invokevirtual #106                // Method android/support/v7/widget/RecyclerView$x.b:(I)V
      85: aload_0
      86: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      89: iload_1
      90: invokestatic  #109                // Method android/support/v7/widget/RecyclerView.a:(Landroid/support/v7/widget/RecyclerView;I)V
      93: return

  public void c(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #57                 // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: astore_1
       5: aload_1
       6: ifnull        17
       9: aload_1
      10: aload_0
      11: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      14: invokestatic  #112                // Method android/support/v7/widget/RecyclerView$x.a:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView;)V
      17: return

  public void d(android.view.View);
    Code:
       0: aload_1
       1: invokestatic  #57                 // Method android/support/v7/widget/RecyclerView.e:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
       4: astore_1
       5: aload_1
       6: ifnull        17
       9: aload_1
      10: aload_0
      11: getfield      #17                 // Field a:Landroid/support/v7/widget/RecyclerView;
      14: invokestatic  #115                // Method android/support/v7/widget/RecyclerView$x.b:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView;)V
      17: return
}
