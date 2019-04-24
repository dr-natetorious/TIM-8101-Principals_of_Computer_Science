public class android.arch.lifecycle.f extends android.arch.lifecycle.c {
  public android.arch.lifecycle.f(android.arch.lifecycle.e);
    Code:
       0: aload_0
       1: invokespecial #29                 // Method android/arch/lifecycle/c."<init>":()V
       4: aload_0
       5: new           #31                 // class android/arch/a/b/a
       8: dup
       9: invokespecial #32                 // Method android/arch/a/b/a."<init>":()V
      12: putfield      #34                 // Field a:Landroid/arch/a/b/a;
      15: aload_0
      16: iconst_0
      17: putfield      #36                 // Field d:I
      20: aload_0
      21: iconst_0
      22: putfield      #38                 // Field e:Z
      25: aload_0
      26: iconst_0
      27: putfield      #40                 // Field f:Z
      30: aload_0
      31: new           #42                 // class java/util/ArrayList
      34: dup
      35: invokespecial #43                 // Method java/util/ArrayList."<init>":()V
      38: putfield      #45                 // Field g:Ljava/util/ArrayList;
      41: aload_0
      42: new           #47                 // class java/lang/ref/WeakReference
      45: dup
      46: aload_1
      47: invokespecial #50                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      50: putfield      #52                 // Field c:Ljava/lang/ref/WeakReference;
      53: aload_0
      54: getstatic     #56                 // Field android/arch/lifecycle/c$b.b:Landroid/arch/lifecycle/c$b;
      57: putfield      #57                 // Field b:Landroid/arch/lifecycle/c$b;
      60: return

  static android.arch.lifecycle.c$b a(android.arch.lifecycle.c$b, android.arch.lifecycle.c$b);
    Code:
       0: aload_0
       1: astore_2
       2: aload_1
       3: ifnull        18
       6: aload_0
       7: astore_2
       8: aload_1
       9: aload_0
      10: invokevirtual #63                 // Method android/arch/lifecycle/c$b.compareTo:(Ljava/lang/Enum;)I
      13: ifge          18
      16: aload_1
      17: astore_2
      18: aload_2
      19: areturn

  static android.arch.lifecycle.c$b b(android.arch.lifecycle.c$a);
    Code:
       0: getstatic     #104                // Field android/arch/lifecycle/f$1.a:[I
       3: aload_0
       4: invokevirtual #110                // Method android/arch/lifecycle/c$a.ordinal:()I
       7: iaload
       8: tableswitch   { // 1 to 6
                     1: 93
                     2: 93
                     3: 89
                     4: 89
                     5: 85
                     6: 81
               default: 48
          }
      48: new           #112                // class java/lang/StringBuilder
      51: dup
      52: invokespecial #113                // Method java/lang/StringBuilder."<init>":()V
      55: astore_1
      56: aload_1
      57: ldc           #115                // String Unexpected event value
      59: invokevirtual #119                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_1
      64: aload_0
      65: invokevirtual #122                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      68: pop
      69: new           #124                // class java/lang/IllegalArgumentException
      72: dup
      73: aload_1
      74: invokevirtual #128                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      77: invokespecial #131                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      80: athrow
      81: getstatic     #132                // Field android/arch/lifecycle/c$b.a:Landroid/arch/lifecycle/c$b;
      84: areturn
      85: getstatic     #134                // Field android/arch/lifecycle/c$b.e:Landroid/arch/lifecycle/c$b;
      88: areturn
      89: getstatic     #136                // Field android/arch/lifecycle/c$b.d:Landroid/arch/lifecycle/c$b;
      92: areturn
      93: getstatic     #138                // Field android/arch/lifecycle/c$b.c:Landroid/arch/lifecycle/c$b;
      96: areturn

  public android.arch.lifecycle.c$b a();
    Code:
       0: aload_0
       1: getfield      #57                 // Field b:Landroid/arch/lifecycle/c$b;
       4: areturn

  public void a(android.arch.lifecycle.c$a);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #147                // Method b:(Landroid/arch/lifecycle/c$a;)Landroid/arch/lifecycle/c$b;
       5: invokespecial #225                // Method b:(Landroid/arch/lifecycle/c$b;)V
       8: return

  public void a(android.arch.lifecycle.c$b);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #225                // Method b:(Landroid/arch/lifecycle/c$b;)V
       5: return

  public void a(android.arch.lifecycle.d);
    Code:
       0: aload_0
       1: getfield      #57                 // Field b:Landroid/arch/lifecycle/c$b;
       4: getstatic     #132                // Field android/arch/lifecycle/c$b.a:Landroid/arch/lifecycle/c$b;
       7: if_acmpne     17
      10: getstatic     #132                // Field android/arch/lifecycle/c$b.a:Landroid/arch/lifecycle/c$b;
      13: astore_3
      14: goto          21
      17: getstatic     #56                 // Field android/arch/lifecycle/c$b.b:Landroid/arch/lifecycle/c$b;
      20: astore_3
      21: new           #8                  // class android/arch/lifecycle/f$a
      24: dup
      25: aload_1
      26: aload_3
      27: invokespecial #229                // Method android/arch/lifecycle/f$a."<init>":(Landroid/arch/lifecycle/d;Landroid/arch/lifecycle/c$b;)V
      30: astore        4
      32: aload_0
      33: getfield      #34                 // Field a:Landroid/arch/a/b/a;
      36: aload_1
      37: aload         4
      39: invokevirtual #232                // Method android/arch/a/b/a.a:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      42: checkcast     #8                  // class android/arch/lifecycle/f$a
      45: ifnull        49
      48: return
      49: aload_0
      50: getfield      #52                 // Field c:Ljava/lang/ref/WeakReference;
      53: invokevirtual #194                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      56: checkcast     #196                // class android/arch/lifecycle/e
      59: astore        5
      61: aload         5
      63: ifnonnull     67
      66: return
      67: aload_0
      68: getfield      #36                 // Field d:I
      71: ifne          89
      74: aload_0
      75: getfield      #38                 // Field e:Z
      78: ifeq          84
      81: goto          89
      84: iconst_0
      85: istore_2
      86: goto          91
      89: iconst_1
      90: istore_2
      91: aload_0
      92: aload_1
      93: invokespecial #234                // Method c:(Landroid/arch/lifecycle/d;)Landroid/arch/lifecycle/c$b;
      96: astore_3
      97: aload_0
      98: aload_0
      99: getfield      #36                 // Field d:I
     102: iconst_1
     103: iadd
     104: putfield      #36                 // Field d:I
     107: aload         4
     109: getfield      #83                 // Field android/arch/lifecycle/f$a.a:Landroid/arch/lifecycle/c$b;
     112: aload_3
     113: invokevirtual #63                 // Method android/arch/lifecycle/c$b.compareTo:(Ljava/lang/Enum;)I
     116: ifge          167
     119: aload_0
     120: getfield      #34                 // Field a:Landroid/arch/a/b/a;
     123: aload_1
     124: invokevirtual #89                 // Method android/arch/a/b/a.c:(Ljava/lang/Object;)Z
     127: ifeq          167
     130: aload_0
     131: aload         4
     133: getfield      #83                 // Field android/arch/lifecycle/f$a.a:Landroid/arch/lifecycle/c$b;
     136: invokespecial #92                 // Method c:(Landroid/arch/lifecycle/c$b;)V
     139: aload         4
     141: aload         5
     143: aload         4
     145: getfield      #83                 // Field android/arch/lifecycle/f$a.a:Landroid/arch/lifecycle/c$b;
     148: invokestatic  #95                 // Method e:(Landroid/arch/lifecycle/c$b;)Landroid/arch/lifecycle/c$a;
     151: invokevirtual #98                 // Method android/arch/lifecycle/f$a.a:(Landroid/arch/lifecycle/e;Landroid/arch/lifecycle/c$a;)V
     154: aload_0
     155: invokespecial #100                // Method c:()V
     158: aload_0
     159: aload_1
     160: invokespecial #234                // Method c:(Landroid/arch/lifecycle/d;)Landroid/arch/lifecycle/c$b;
     163: astore_3
     164: goto          107
     167: iload_2
     168: ifne          175
     171: aload_0
     172: invokespecial #140                // Method d:()V
     175: aload_0
     176: aload_0
     177: getfield      #36                 // Field d:I
     180: iconst_1
     181: isub
     182: putfield      #36                 // Field d:I
     185: return

  public void b(android.arch.lifecycle.d);
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Landroid/arch/a/b/a;
       4: aload_1
       5: invokevirtual #237                // Method android/arch/a/b/a.b:(Ljava/lang/Object;)Ljava/lang/Object;
       8: pop
       9: return
}
