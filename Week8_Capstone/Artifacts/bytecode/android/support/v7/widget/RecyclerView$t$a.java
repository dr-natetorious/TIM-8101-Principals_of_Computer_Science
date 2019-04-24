public class android.support.v7.widget.RecyclerView$t$a {
  void a(android.support.v7.widget.RecyclerView);
    Code:
       0: aload_0
       1: getfield      #38                 // Field d:I
       4: iflt          28
       7: aload_0
       8: getfield      #38                 // Field d:I
      11: istore_2
      12: aload_0
      13: iconst_m1
      14: putfield      #38                 // Field d:I
      17: aload_1
      18: iload_2
      19: invokevirtual #41                 // Method android/support/v7/widget/RecyclerView.a:(I)V
      22: aload_0
      23: iconst_0
      24: putfield      #43                 // Field f:Z
      27: return
      28: aload_0
      29: getfield      #43                 // Field f:Z
      32: ifeq          151
      35: aload_0
      36: invokespecial #45                 // Method b:()V
      39: aload_0
      40: getfield      #22                 // Field e:Landroid/view/animation/Interpolator;
      43: ifnonnull     95
      46: aload_0
      47: getfield      #24                 // Field c:I
      50: ldc           #46                 // int -2147483648
      52: if_icmpne     73
      55: aload_1
      56: getfield      #50                 // Field android/support/v7/widget/RecyclerView.z:Landroid/support/v7/widget/RecyclerView$w;
      59: aload_0
      60: getfield      #52                 // Field a:I
      63: aload_0
      64: getfield      #54                 // Field b:I
      67: invokevirtual #59                 // Method android/support/v7/widget/RecyclerView$w.b:(II)V
      70: goto          118
      73: aload_1
      74: getfield      #50                 // Field android/support/v7/widget/RecyclerView.z:Landroid/support/v7/widget/RecyclerView$w;
      77: aload_0
      78: getfield      #52                 // Field a:I
      81: aload_0
      82: getfield      #54                 // Field b:I
      85: aload_0
      86: getfield      #24                 // Field c:I
      89: invokevirtual #62                 // Method android/support/v7/widget/RecyclerView$w.a:(III)V
      92: goto          118
      95: aload_1
      96: getfield      #50                 // Field android/support/v7/widget/RecyclerView.z:Landroid/support/v7/widget/RecyclerView$w;
      99: aload_0
     100: getfield      #52                 // Field a:I
     103: aload_0
     104: getfield      #54                 // Field b:I
     107: aload_0
     108: getfield      #24                 // Field c:I
     111: aload_0
     112: getfield      #22                 // Field e:Landroid/view/animation/Interpolator;
     115: invokevirtual #65                 // Method android/support/v7/widget/RecyclerView$w.a:(IIILandroid/view/animation/Interpolator;)V
     118: aload_0
     119: aload_0
     120: getfield      #67                 // Field g:I
     123: iconst_1
     124: iadd
     125: putfield      #67                 // Field g:I
     128: aload_0
     129: getfield      #67                 // Field g:I
     132: bipush        10
     134: if_icmple     145
     137: ldc           #69                 // String RecyclerView
     139: ldc           #71                 // String Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary
     141: invokestatic  #76                 // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
     144: pop
     145: aload_0
     146: iconst_0
     147: putfield      #43                 // Field f:Z
     150: return
     151: aload_0
     152: iconst_0
     153: putfield      #67                 // Field g:I
     156: return

  boolean a();
    Code:
       0: aload_0
       1: getfield      #38                 // Field d:I
       4: iflt          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn
}
