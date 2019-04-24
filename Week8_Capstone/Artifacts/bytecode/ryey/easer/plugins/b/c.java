public abstract class ryey.easer.plugins.b.c implements ryey.easer.commons.local_plugin.f {
  protected java.lang.Integer a;

  protected java.lang.Integer b;

  protected java.lang.Integer c;

  protected ryey.easer.plugins.b.c();
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #16                 // Field a:Ljava/lang/Integer;
       9: aload_0
      10: aconst_null
      11: putfield      #18                 // Field b:Ljava/lang/Integer;
      14: aload_0
      15: aconst_null
      16: putfield      #20                 // Field c:Ljava/lang/Integer;
      19: return

  protected ryey.easer.plugins.b.c(java.lang.Integer);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #16                 // Field a:Ljava/lang/Integer;
       9: aload_0
      10: aconst_null
      11: putfield      #18                 // Field b:Ljava/lang/Integer;
      14: aload_0
      15: aconst_null
      16: putfield      #20                 // Field c:Ljava/lang/Integer;
      19: aload_0
      20: aload_1
      21: putfield      #16                 // Field a:Ljava/lang/Integer;
      24: return

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokestatic  #29                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
       5: putfield      #16                 // Field a:Ljava/lang/Integer;
       8: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Ljava/lang/Integer;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #18                 // Field b:Ljava/lang/Integer;
      13: ifnull        35
      16: aload_0
      17: getfield      #16                 // Field a:Ljava/lang/Integer;
      20: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      23: aload_0
      24: getfield      #18                 // Field b:Ljava/lang/Integer;
      27: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      30: if_icmpge     35
      33: iconst_0
      34: ireturn
      35: aload_0
      36: getfield      #20                 // Field c:Ljava/lang/Integer;
      39: ifnull        61
      42: aload_0
      43: getfield      #16                 // Field a:Ljava/lang/Integer;
      46: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      49: aload_0
      50: getfield      #20                 // Field c:Ljava/lang/Integer;
      53: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      56: if_icmple     61
      59: iconst_0
      60: ireturn
      61: iconst_1
      62: ireturn

  public java.lang.Integer d();
    Code:
       0: aload_0
       1: getfield      #16                 // Field a:Ljava/lang/Integer;
       4: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_0
       7: invokevirtual #42                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      10: aload_1
      11: invokevirtual #42                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      14: invokevirtual #44                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      17: ifne          22
      20: iconst_0
      21: ireturn
      22: aload_0
      23: invokevirtual #46                 // Method a:()Z
      26: ifeq          107
      29: aload_1
      30: checkcast     #6                  // class ryey/easer/commons/local_plugin/f
      33: invokeinterface #47,  1           // InterfaceMethod ryey/easer/commons/local_plugin/f.a:()Z
      38: ifne          43
      41: iconst_0
      42: ireturn
      43: aload_1
      44: checkcast     #2                  // class ryey/easer/plugins/b/c
      47: astore_1
      48: aload_1
      49: getfield      #18                 // Field b:Ljava/lang/Integer;
      52: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      55: aload_0
      56: getfield      #18                 // Field b:Ljava/lang/Integer;
      59: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      62: if_icmpeq     67
      65: iconst_0
      66: ireturn
      67: aload_1
      68: getfield      #20                 // Field c:Ljava/lang/Integer;
      71: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      74: aload_0
      75: getfield      #20                 // Field c:Ljava/lang/Integer;
      78: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      81: if_icmpeq     86
      84: iconst_0
      85: ireturn
      86: aload_1
      87: getfield      #16                 // Field a:Ljava/lang/Integer;
      90: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
      93: aload_0
      94: getfield      #16                 // Field a:Ljava/lang/Integer;
      97: invokevirtual #34                 // Method java/lang/Integer.intValue:()I
     100: if_icmpeq     105
     103: iconst_0
     104: ireturn
     105: iconst_1
     106: ireturn
     107: iconst_0
     108: ireturn
}
