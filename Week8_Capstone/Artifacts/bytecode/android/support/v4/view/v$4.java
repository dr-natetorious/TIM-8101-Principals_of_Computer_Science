class android.support.v4.view.v$4 implements android.support.v4.view.p {
  final android.support.v4.view.v a;

  android.support.v4.view.v$4(android.support.v4.view.v);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field a:Landroid/support/v4/view/v;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: new           #23                 // class android/graphics/Rect
      13: dup
      14: invokespecial #24                 // Method android/graphics/Rect."<init>":()V
      17: putfield      #26                 // Field b:Landroid/graphics/Rect;
      20: return

  public android.support.v4.view.ab a(android.view.View, android.support.v4.view.ab);
    Code:
       0: aload_1
       1: aload_2
       2: invokestatic  #32                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/support/v4/view/ab;)Landroid/support/v4/view/ab;
       5: astore_1
       6: aload_1
       7: invokevirtual #38                 // Method android/support/v4/view/ab.f:()Z
      10: ifeq          15
      13: aload_1
      14: areturn
      15: aload_0
      16: getfield      #26                 // Field b:Landroid/graphics/Rect;
      19: astore_2
      20: aload_2
      21: aload_1
      22: invokevirtual #41                 // Method android/support/v4/view/ab.a:()I
      25: putfield      #45                 // Field android/graphics/Rect.left:I
      28: aload_2
      29: aload_1
      30: invokevirtual #47                 // Method android/support/v4/view/ab.b:()I
      33: putfield      #50                 // Field android/graphics/Rect.top:I
      36: aload_2
      37: aload_1
      38: invokevirtual #53                 // Method android/support/v4/view/ab.c:()I
      41: putfield      #56                 // Field android/graphics/Rect.right:I
      44: aload_2
      45: aload_1
      46: invokevirtual #59                 // Method android/support/v4/view/ab.d:()I
      49: putfield      #62                 // Field android/graphics/Rect.bottom:I
      52: iconst_0
      53: istore_3
      54: aload_0
      55: getfield      #19                 // Field a:Landroid/support/v4/view/v;
      58: invokevirtual #65                 // Method android/support/v4/view/v.getChildCount:()I
      61: istore        4
      63: iload_3
      64: iload         4
      66: if_icmpge     154
      69: aload_0
      70: getfield      #19                 // Field a:Landroid/support/v4/view/v;
      73: iload_3
      74: invokevirtual #69                 // Method android/support/v4/view/v.getChildAt:(I)Landroid/view/View;
      77: aload_1
      78: invokestatic  #71                 // Method android/support/v4/view/s.b:(Landroid/view/View;Landroid/support/v4/view/ab;)Landroid/support/v4/view/ab;
      81: astore        5
      83: aload_2
      84: aload         5
      86: invokevirtual #41                 // Method android/support/v4/view/ab.a:()I
      89: aload_2
      90: getfield      #45                 // Field android/graphics/Rect.left:I
      93: invokestatic  #77                 // Method java/lang/Math.min:(II)I
      96: putfield      #45                 // Field android/graphics/Rect.left:I
      99: aload_2
     100: aload         5
     102: invokevirtual #47                 // Method android/support/v4/view/ab.b:()I
     105: aload_2
     106: getfield      #50                 // Field android/graphics/Rect.top:I
     109: invokestatic  #77                 // Method java/lang/Math.min:(II)I
     112: putfield      #50                 // Field android/graphics/Rect.top:I
     115: aload_2
     116: aload         5
     118: invokevirtual #53                 // Method android/support/v4/view/ab.c:()I
     121: aload_2
     122: getfield      #56                 // Field android/graphics/Rect.right:I
     125: invokestatic  #77                 // Method java/lang/Math.min:(II)I
     128: putfield      #56                 // Field android/graphics/Rect.right:I
     131: aload_2
     132: aload         5
     134: invokevirtual #59                 // Method android/support/v4/view/ab.d:()I
     137: aload_2
     138: getfield      #62                 // Field android/graphics/Rect.bottom:I
     141: invokestatic  #77                 // Method java/lang/Math.min:(II)I
     144: putfield      #62                 // Field android/graphics/Rect.bottom:I
     147: iload_3
     148: iconst_1
     149: iadd
     150: istore_3
     151: goto          63
     154: aload_1
     155: aload_2
     156: getfield      #45                 // Field android/graphics/Rect.left:I
     159: aload_2
     160: getfield      #50                 // Field android/graphics/Rect.top:I
     163: aload_2
     164: getfield      #56                 // Field android/graphics/Rect.right:I
     167: aload_2
     168: getfield      #62                 // Field android/graphics/Rect.bottom:I
     171: invokevirtual #80                 // Method android/support/v4/view/ab.a:(IIII)Landroid/support/v4/view/ab;
     174: areturn
}
