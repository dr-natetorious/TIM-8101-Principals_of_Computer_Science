class android.support.v4.widget.a$a {
  android.support.v4.widget.a$a();
    Code:
       0: aload_0
       1: invokespecial #24                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: ldc2_w        #25                 // long -9223372036854775808l
       8: putfield      #28                 // Field e:J
      11: aload_0
      12: ldc2_w        #29                 // long -1l
      15: putfield      #32                 // Field i:J
      18: aload_0
      19: lconst_0
      20: putfield      #34                 // Field f:J
      23: aload_0
      24: iconst_0
      25: putfield      #36                 // Field g:I
      28: aload_0
      29: iconst_0
      30: putfield      #38                 // Field h:I
      33: return

  public void a();
    Code:
       0: aload_0
       1: invokestatic  #59                 // Method android/view/animation/AnimationUtils.currentAnimationTimeMillis:()J
       4: putfield      #28                 // Field e:J
       7: aload_0
       8: ldc2_w        #29                 // long -1l
      11: putfield      #32                 // Field i:J
      14: aload_0
      15: aload_0
      16: getfield      #28                 // Field e:J
      19: putfield      #34                 // Field f:J
      22: aload_0
      23: ldc           #53                 // float 0.5f
      25: putfield      #45                 // Field j:F
      28: aload_0
      29: iconst_0
      30: putfield      #36                 // Field g:I
      33: aload_0
      34: iconst_0
      35: putfield      #38                 // Field h:I
      38: return

  public void a(float, float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #62                 // Field c:F
       5: aload_0
       6: fload_2
       7: putfield      #64                 // Field d:F
      10: return

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #52                 // Field a:I
       5: return

  public void b();
    Code:
       0: invokestatic  #59                 // Method android/view/animation/AnimationUtils.currentAnimationTimeMillis:()J
       3: lstore_1
       4: aload_0
       5: lload_1
       6: aload_0
       7: getfield      #28                 // Field e:J
      10: lsub
      11: l2i
      12: iconst_0
      13: aload_0
      14: getfield      #67                 // Field b:I
      17: invokestatic  #70                 // Method android/support/v4/widget/a.a:(III)I
      20: putfield      #47                 // Field k:I
      23: aload_0
      24: aload_0
      25: lload_1
      26: invokespecial #72                 // Method a:(J)F
      29: putfield      #45                 // Field j:F
      32: aload_0
      33: lload_1
      34: putfield      #32                 // Field i:J
      37: return

  public void b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #67                 // Field b:I
       5: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #32                 // Field i:J
       4: lconst_0
       5: lcmp
       6: ifle          28
       9: invokestatic  #59                 // Method android/view/animation/AnimationUtils.currentAnimationTimeMillis:()J
      12: aload_0
      13: getfield      #32                 // Field i:J
      16: aload_0
      17: getfield      #47                 // Field k:I
      20: i2l
      21: ladd
      22: lcmp
      23: ifle          28
      26: iconst_1
      27: ireturn
      28: iconst_0
      29: ireturn

  public void d();
    Code:
       0: aload_0
       1: getfield      #34                 // Field f:J
       4: lconst_0
       5: lcmp
       6: ifne          19
       9: new           #75                 // class java/lang/RuntimeException
      12: dup
      13: ldc           #77                 // String Cannot compute scroll delta before calling start()
      15: invokespecial #80                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      18: athrow
      19: invokestatic  #59                 // Method android/view/animation/AnimationUtils.currentAnimationTimeMillis:()J
      22: lstore_2
      23: aload_0
      24: aload_0
      25: lload_2
      26: invokespecial #72                 // Method a:(J)F
      29: invokespecial #82                 // Method a:(F)F
      32: fstore_1
      33: aload_0
      34: getfield      #34                 // Field f:J
      37: lstore        4
      39: aload_0
      40: lload_2
      41: putfield      #34                 // Field f:J
      44: lload_2
      45: lload         4
      47: lsub
      48: l2f
      49: fload_1
      50: fmul
      51: fstore_1
      52: aload_0
      53: aload_0
      54: getfield      #62                 // Field c:F
      57: fload_1
      58: fmul
      59: f2i
      60: putfield      #36                 // Field g:I
      63: aload_0
      64: fload_1
      65: aload_0
      66: getfield      #64                 // Field d:F
      69: fmul
      70: f2i
      71: putfield      #38                 // Field h:I
      74: return

  public int e();
    Code:
       0: aload_0
       1: getfield      #62                 // Field c:F
       4: aload_0
       5: getfield      #62                 // Field c:F
       8: invokestatic  #88                 // Method java/lang/Math.abs:(F)F
      11: fdiv
      12: f2i
      13: ireturn

  public int f();
    Code:
       0: aload_0
       1: getfield      #64                 // Field d:F
       4: aload_0
       5: getfield      #64                 // Field d:F
       8: invokestatic  #88                 // Method java/lang/Math.abs:(F)F
      11: fdiv
      12: f2i
      13: ireturn

  public int g();
    Code:
       0: aload_0
       1: getfield      #36                 // Field g:I
       4: ireturn

  public int h();
    Code:
       0: aload_0
       1: getfield      #38                 // Field h:I
       4: ireturn
}
