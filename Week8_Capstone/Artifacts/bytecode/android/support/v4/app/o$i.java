class android.support.v4.app.o$i implements android.support.v4.app.i$c {
  android.support.v4.app.o$i(android.support.v4.app.c, boolean);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_2
       6: putfield      #22                 // Field a:Z
       9: aload_0
      10: aload_1
      11: putfield      #24                 // Field b:Landroid/support/v4/app/c;
      14: return

  static boolean a(android.support.v4.app.o$i);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Z
       4: ireturn

  static android.support.v4.app.c b(android.support.v4.app.o$i);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Landroid/support/v4/app/c;
       4: areturn

  public void a();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #29                 // Field c:I
       5: iconst_1
       6: isub
       7: putfield      #29                 // Field c:I
      10: aload_0
      11: getfield      #29                 // Field c:I
      14: ifeq          18
      17: return
      18: aload_0
      19: getfield      #24                 // Field b:Landroid/support/v4/app/c;
      22: getfield      #34                 // Field android/support/v4/app/c.a:Landroid/support/v4/app/o;
      25: invokestatic  #37                 // Method android/support/v4/app/o.a:(Landroid/support/v4/app/o;)V
      28: return

  public void b();
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #29                 // Field c:I
       5: iconst_1
       6: iadd
       7: putfield      #29                 // Field c:I
      10: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #29                 // Field c:I
       4: ifne          9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public void d();
    Code:
       0: aload_0
       1: getfield      #29                 // Field c:I
       4: istore_1
       5: iconst_0
       6: istore_2
       7: iload_1
       8: ifle          16
      11: iconst_1
      12: istore_1
      13: goto          18
      16: iconst_0
      17: istore_1
      18: aload_0
      19: getfield      #24                 // Field b:Landroid/support/v4/app/c;
      22: getfield      #34                 // Field android/support/v4/app/c.a:Landroid/support/v4/app/o;
      25: astore        4
      27: aload         4
      29: getfield      #43                 // Field android/support/v4/app/o.e:Ljava/util/ArrayList;
      32: invokevirtual #49                 // Method java/util/ArrayList.size:()I
      35: istore_3
      36: iload_2
      37: iload_3
      38: if_icmpge     85
      41: aload         4
      43: getfield      #43                 // Field android/support/v4/app/o.e:Ljava/util/ArrayList;
      46: iload_2
      47: invokevirtual #53                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      50: checkcast     #55                 // class android/support/v4/app/i
      53: astore        5
      55: aload         5
      57: aconst_null
      58: invokevirtual #59                 // Method android/support/v4/app/i.setOnStartEnterTransitionListener:(Landroid/support/v4/app/i$c;)V
      61: iload_1
      62: ifeq          78
      65: aload         5
      67: invokevirtual #62                 // Method android/support/v4/app/i.isPostponed:()Z
      70: ifeq          78
      73: aload         5
      75: invokevirtual #65                 // Method android/support/v4/app/i.startPostponedEnterTransition:()V
      78: iload_2
      79: iconst_1
      80: iadd
      81: istore_2
      82: goto          36
      85: aload_0
      86: getfield      #24                 // Field b:Landroid/support/v4/app/c;
      89: getfield      #34                 // Field android/support/v4/app/c.a:Landroid/support/v4/app/o;
      92: aload_0
      93: getfield      #24                 // Field b:Landroid/support/v4/app/c;
      96: aload_0
      97: getfield      #22                 // Field a:Z
     100: iload_1
     101: iconst_1
     102: ixor
     103: iconst_1
     104: invokestatic  #68                 // Method android/support/v4/app/o.a:(Landroid/support/v4/app/o;Landroid/support/v4/app/c;ZZZ)V
     107: return

  public void e();
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Landroid/support/v4/app/c;
       4: getfield      #34                 // Field android/support/v4/app/c.a:Landroid/support/v4/app/o;
       7: aload_0
       8: getfield      #24                 // Field b:Landroid/support/v4/app/c;
      11: aload_0
      12: getfield      #22                 // Field a:Z
      15: iconst_0
      16: iconst_0
      17: invokestatic  #68                 // Method android/support/v4/app/o.a:(Landroid/support/v4/app/o;Landroid/support/v4/app/c;ZZZ)V
      20: return
}
