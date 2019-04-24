class android.support.v4.widget.a$b implements java.lang.Runnable {
  final android.support.v4.widget.a a;

  android.support.v4.widget.a$b(android.support.v4.widget.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v4/widget/a;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
       4: getfield      #24                 // Field android/support/v4/widget/a.e:Z
       7: ifne          11
      10: return
      11: aload_0
      12: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
      15: getfield      #27                 // Field android/support/v4/widget/a.c:Z
      18: ifeq          39
      21: aload_0
      22: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
      25: iconst_0
      26: putfield      #27                 // Field android/support/v4/widget/a.c:Z
      29: aload_0
      30: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
      33: getfield      #30                 // Field android/support/v4/widget/a.a:Landroid/support/v4/widget/a$a;
      36: invokevirtual #34                 // Method android/support/v4/widget/a$a.a:()V
      39: aload_0
      40: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
      43: getfield      #30                 // Field android/support/v4/widget/a.a:Landroid/support/v4/widget/a$a;
      46: astore_3
      47: aload_3
      48: invokevirtual #37                 // Method android/support/v4/widget/a$a.c:()Z
      51: ifne          127
      54: aload_0
      55: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
      58: invokevirtual #39                 // Method android/support/v4/widget/a.a:()Z
      61: ifne          67
      64: goto          127
      67: aload_0
      68: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
      71: getfield      #42                 // Field android/support/v4/widget/a.d:Z
      74: ifeq          92
      77: aload_0
      78: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
      81: iconst_0
      82: putfield      #42                 // Field android/support/v4/widget/a.d:Z
      85: aload_0
      86: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
      89: invokevirtual #44                 // Method android/support/v4/widget/a.b:()V
      92: aload_3
      93: invokevirtual #46                 // Method android/support/v4/widget/a$a.d:()V
      96: aload_3
      97: invokevirtual #50                 // Method android/support/v4/widget/a$a.g:()I
     100: istore_1
     101: aload_3
     102: invokevirtual #53                 // Method android/support/v4/widget/a$a.h:()I
     105: istore_2
     106: aload_0
     107: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
     110: iload_1
     111: iload_2
     112: invokevirtual #56                 // Method android/support/v4/widget/a.a:(II)V
     115: aload_0
     116: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
     119: getfield      #59                 // Field android/support/v4/widget/a.b:Landroid/view/View;
     122: aload_0
     123: invokestatic  #64                 // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/Runnable;)V
     126: return
     127: aload_0
     128: getfield      #15                 // Field a:Landroid/support/v4/widget/a;
     131: iconst_0
     132: putfield      #24                 // Field android/support/v4/widget/a.e:Z
     135: return
}
