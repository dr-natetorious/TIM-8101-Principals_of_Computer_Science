class android.support.v7.widget.bw {
  final android.support.v4.g.a<android.support.v7.widget.RecyclerView$x, android.support.v7.widget.bw$a> a;

  final android.support.v4.g.f<android.support.v7.widget.RecyclerView$x> b;

  android.support.v7.widget.bw();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #20                 // class android/support/v4/g/a
       8: dup
       9: invokespecial #21                 // Method android/support/v4/g/a."<init>":()V
      12: putfield      #23                 // Field a:Landroid/support/v4/g/a;
      15: aload_0
      16: new           #25                 // class android/support/v4/g/f
      19: dup
      20: invokespecial #26                 // Method android/support/v4/g/f."<init>":()V
      23: putfield      #28                 // Field b:Landroid/support/v4/g/f;
      26: return

  android.support.v7.widget.RecyclerView$x a(long);
    Code:
       0: aload_0
       1: getfield      #28                 // Field b:Landroid/support/v4/g/f;
       4: lload_1
       5: invokevirtual #62                 // Method android/support/v4/g/f.a:(J)Ljava/lang/Object;
       8: checkcast     #64                 // class android/support/v7/widget/RecyclerView$x
      11: areturn

  void a();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: invokevirtual #67                 // Method android/support/v4/g/a.clear:()V
       7: aload_0
       8: getfield      #28                 // Field b:Landroid/support/v4/g/f;
      11: invokevirtual #69                 // Method android/support/v4/g/f.c:()V
      14: return

  void a(long, android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #28                 // Field b:Landroid/support/v4/g/f;
       4: lload_1
       5: aload_3
       6: invokevirtual #73                 // Method android/support/v4/g/f.b:(JLjava/lang/Object;)V
       9: return

  void a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #78                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #6                  // class android/support/v7/widget/bw$a
      11: astore        4
      13: aload         4
      15: astore_3
      16: aload         4
      18: ifnonnull     35
      21: invokestatic  #81                 // Method android/support/v7/widget/bw$a.a:()Landroid/support/v7/widget/bw$a;
      24: astore_3
      25: aload_0
      26: getfield      #23                 // Field a:Landroid/support/v4/g/a;
      29: aload_1
      30: aload_3
      31: invokevirtual #85                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      34: pop
      35: aload_3
      36: aload_2
      37: putfield      #43                 // Field android/support/v7/widget/bw$a.b:Landroid/support/v7/widget/RecyclerView$f$c;
      40: aload_3
      41: aload_3
      42: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      45: iconst_4
      46: ior
      47: putfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      50: return

  void a(android.support.v7.widget.bw$b);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: invokevirtual #90                 // Method android/support/v4/g/a.size:()I
       7: iconst_1
       8: isub
       9: istore_2
      10: iload_2
      11: iflt          235
      14: aload_0
      15: getfield      #23                 // Field a:Landroid/support/v4/g/a;
      18: iload_2
      19: invokevirtual #92                 // Method android/support/v4/g/a.b:(I)Ljava/lang/Object;
      22: checkcast     #64                 // class android/support/v7/widget/RecyclerView$x
      25: astore        6
      27: aload_0
      28: getfield      #23                 // Field a:Landroid/support/v4/g/a;
      31: iload_2
      32: invokevirtual #48                 // Method android/support/v4/g/a.d:(I)Ljava/lang/Object;
      35: checkcast     #6                  // class android/support/v7/widget/bw$a
      38: astore        7
      40: aload         7
      42: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      45: iconst_3
      46: iand
      47: iconst_3
      48: if_icmpne     62
      51: aload_1
      52: aload         6
      54: invokeinterface #95,  2           // InterfaceMethod android/support/v7/widget/bw$b.a:(Landroid/support/v7/widget/RecyclerView$x;)V
      59: goto          223
      62: aload         7
      64: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      67: iconst_1
      68: iand
      69: ifeq          112
      72: aload         7
      74: getfield      #43                 // Field android/support/v7/widget/bw$a.b:Landroid/support/v7/widget/RecyclerView$f$c;
      77: ifnonnull     83
      80: goto          51
      83: aload         7
      85: getfield      #43                 // Field android/support/v7/widget/bw$a.b:Landroid/support/v7/widget/RecyclerView$f$c;
      88: astore        4
      90: aload         7
      92: getfield      #45                 // Field android/support/v7/widget/bw$a.c:Landroid/support/v7/widget/RecyclerView$f$c;
      95: astore        5
      97: aload_1
      98: aload         6
     100: aload         4
     102: aload         5
     104: invokeinterface #98,  4           // InterfaceMethod android/support/v7/widget/bw$b.a:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$f$c;Landroid/support/v7/widget/RecyclerView$f$c;)V
     109: goto          223
     112: aload         7
     114: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
     117: bipush        14
     119: iand
     120: bipush        14
     122: if_icmpne     146
     125: aload_1
     126: aload         6
     128: aload         7
     130: getfield      #43                 // Field android/support/v7/widget/bw$a.b:Landroid/support/v7/widget/RecyclerView$f$c;
     133: aload         7
     135: getfield      #45                 // Field android/support/v7/widget/bw$a.c:Landroid/support/v7/widget/RecyclerView$f$c;
     138: invokeinterface #100,  4          // InterfaceMethod android/support/v7/widget/bw$b.b:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$f$c;Landroid/support/v7/widget/RecyclerView$f$c;)V
     143: goto          223
     146: aload         7
     148: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
     151: bipush        12
     153: iand
     154: bipush        12
     156: if_icmpne     180
     159: aload_1
     160: aload         6
     162: aload         7
     164: getfield      #43                 // Field android/support/v7/widget/bw$a.b:Landroid/support/v7/widget/RecyclerView$f$c;
     167: aload         7
     169: getfield      #45                 // Field android/support/v7/widget/bw$a.c:Landroid/support/v7/widget/RecyclerView$f$c;
     172: invokeinterface #102,  4          // InterfaceMethod android/support/v7/widget/bw$b.c:(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$f$c;Landroid/support/v7/widget/RecyclerView$f$c;)V
     177: goto          223
     180: aload         7
     182: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
     185: iconst_4
     186: iand
     187: ifeq          203
     190: aload         7
     192: getfield      #43                 // Field android/support/v7/widget/bw$a.b:Landroid/support/v7/widget/RecyclerView$f$c;
     195: astore        4
     197: aconst_null
     198: astore        5
     200: goto          97
     203: aload         7
     205: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
     208: bipush        8
     210: iand
     211: ifeq          217
     214: goto          125
     217: aload         7
     219: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
     222: istore_3
     223: aload         7
     225: invokestatic  #51                 // Method android/support/v7/widget/bw$a.a:(Landroid/support/v7/widget/bw$a;)V
     228: iload_2
     229: iconst_1
     230: isub
     231: istore_2
     232: goto          10
     235: return

  boolean a(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #78                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #6                  // class android/support/v7/widget/bw$a
      11: astore_1
      12: aload_1
      13: ifnull        27
      16: aload_1
      17: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      20: iconst_1
      21: iand
      22: ifeq          27
      25: iconst_1
      26: ireturn
      27: iconst_0
      28: ireturn

  android.support.v7.widget.RecyclerView$f$c b(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_4
       3: invokespecial #106                // Method a:(Landroid/support/v7/widget/RecyclerView$x;I)Landroid/support/v7/widget/RecyclerView$f$c;
       6: areturn

  void b();
    Code:
       0: invokestatic  #108                // Method android/support/v7/widget/bw$a.b:()V
       3: return

  void b(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #78                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #6                  // class android/support/v7/widget/bw$a
      11: astore        4
      13: aload         4
      15: astore_3
      16: aload         4
      18: ifnonnull     35
      21: invokestatic  #81                 // Method android/support/v7/widget/bw$a.a:()Landroid/support/v7/widget/bw$a;
      24: astore_3
      25: aload_0
      26: getfield      #23                 // Field a:Landroid/support/v4/g/a;
      29: aload_1
      30: aload_3
      31: invokevirtual #85                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      34: pop
      35: aload_3
      36: aload_3
      37: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      40: iconst_2
      41: ior
      42: putfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      45: aload_3
      46: aload_2
      47: putfield      #43                 // Field android/support/v7/widget/bw$a.b:Landroid/support/v7/widget/RecyclerView$f$c;
      50: return

  android.support.v7.widget.RecyclerView$f$c c(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: bipush        8
       4: invokespecial #106                // Method a:(Landroid/support/v7/widget/RecyclerView$x;I)Landroid/support/v7/widget/RecyclerView$f$c;
       7: areturn

  void c(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$f$c);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #78                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #6                  // class android/support/v7/widget/bw$a
      11: astore        4
      13: aload         4
      15: astore_3
      16: aload         4
      18: ifnonnull     35
      21: invokestatic  #81                 // Method android/support/v7/widget/bw$a.a:()Landroid/support/v7/widget/bw$a;
      24: astore_3
      25: aload_0
      26: getfield      #23                 // Field a:Landroid/support/v4/g/a;
      29: aload_1
      30: aload_3
      31: invokevirtual #85                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      34: pop
      35: aload_3
      36: aload_2
      37: putfield      #45                 // Field android/support/v7/widget/bw$a.c:Landroid/support/v7/widget/RecyclerView$f$c;
      40: aload_3
      41: aload_3
      42: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      45: bipush        8
      47: ior
      48: putfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      51: return

  boolean d(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #78                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #6                  // class android/support/v7/widget/bw$a
      11: astore_1
      12: aload_1
      13: ifnull        27
      16: aload_1
      17: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      20: iconst_4
      21: iand
      22: ifeq          27
      25: iconst_1
      26: ireturn
      27: iconst_0
      28: ireturn

  void e(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #78                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #6                  // class android/support/v7/widget/bw$a
      11: astore_3
      12: aload_3
      13: astore_2
      14: aload_3
      15: ifnonnull     32
      18: invokestatic  #81                 // Method android/support/v7/widget/bw$a.a:()Landroid/support/v7/widget/bw$a;
      21: astore_2
      22: aload_0
      23: getfield      #23                 // Field a:Landroid/support/v4/g/a;
      26: aload_1
      27: aload_2
      28: invokevirtual #85                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      31: pop
      32: aload_2
      33: aload_2
      34: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      37: iconst_1
      38: ior
      39: putfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      42: return

  void f(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v4/g/a;
       4: aload_1
       5: invokevirtual #78                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #6                  // class android/support/v7/widget/bw$a
      11: astore_1
      12: aload_1
      13: ifnonnull     17
      16: return
      17: aload_1
      18: aload_1
      19: getfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      22: bipush        -2
      24: iand
      25: putfield      #40                 // Field android/support/v7/widget/bw$a.a:I
      28: return

  void g(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: getfield      #28                 // Field b:Landroid/support/v4/g/f;
       4: invokevirtual #113                // Method android/support/v4/g/f.b:()I
       7: iconst_1
       8: isub
       9: istore_2
      10: iload_2
      11: iflt          44
      14: aload_1
      15: aload_0
      16: getfield      #28                 // Field b:Landroid/support/v4/g/f;
      19: iload_2
      20: invokevirtual #114                // Method android/support/v4/g/f.c:(I)Ljava/lang/Object;
      23: if_acmpne     37
      26: aload_0
      27: getfield      #28                 // Field b:Landroid/support/v4/g/f;
      30: iload_2
      31: invokevirtual #117                // Method android/support/v4/g/f.a:(I)V
      34: goto          44
      37: iload_2
      38: iconst_1
      39: isub
      40: istore_2
      41: goto          10
      44: aload_0
      45: getfield      #23                 // Field a:Landroid/support/v4/g/a;
      48: aload_1
      49: invokevirtual #120                // Method android/support/v4/g/a.remove:(Ljava/lang/Object;)Ljava/lang/Object;
      52: checkcast     #6                  // class android/support/v7/widget/bw$a
      55: astore_1
      56: aload_1
      57: ifnull        64
      60: aload_1
      61: invokestatic  #51                 // Method android/support/v7/widget/bw$a.a:(Landroid/support/v7/widget/bw$a;)V
      64: return

  public void h(android.support.v7.widget.RecyclerView$x);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #123                // Method f:(Landroid/support/v7/widget/RecyclerView$x;)V
       5: return
}
