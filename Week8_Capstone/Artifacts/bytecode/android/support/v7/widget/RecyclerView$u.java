public class android.support.v7.widget.RecyclerView$u {
  int a;

  int b;

  int c;

  int d;

  boolean e;

  boolean f;

  boolean g;

  boolean h;

  boolean i;

  boolean j;

  int k;

  long l;

  int m;

  int n;

  int o;

  public android.support.v7.widget.RecyclerView$u();
    Code:
       0: aload_0
       1: invokespecial #33                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #35                 // Field p:I
       9: aload_0
      10: iconst_0
      11: putfield      #37                 // Field a:I
      14: aload_0
      15: iconst_0
      16: putfield      #39                 // Field b:I
      19: aload_0
      20: iconst_1
      21: putfield      #41                 // Field c:I
      24: aload_0
      25: iconst_0
      26: putfield      #43                 // Field d:I
      29: aload_0
      30: iconst_0
      31: putfield      #45                 // Field e:Z
      34: aload_0
      35: iconst_0
      36: putfield      #47                 // Field f:Z
      39: aload_0
      40: iconst_0
      41: putfield      #49                 // Field g:Z
      44: aload_0
      45: iconst_0
      46: putfield      #51                 // Field h:Z
      49: aload_0
      50: iconst_0
      51: putfield      #53                 // Field i:Z
      54: aload_0
      55: iconst_0
      56: putfield      #55                 // Field j:Z
      59: return

  static int a(android.support.v7.widget.RecyclerView$u, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #35                 // Field p:I
       5: iload_1
       6: ireturn

  void a(int);
    Code:
       0: aload_0
       1: getfield      #41                 // Field c:I
       4: iload_1
       5: iand
       6: ifne          64
       9: new           #60                 // class java/lang/StringBuilder
      12: dup
      13: invokespecial #61                 // Method java/lang/StringBuilder."<init>":()V
      16: astore_2
      17: aload_2
      18: ldc           #63                 // String Layout state should be one of
      20: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_2
      25: iload_1
      26: invokestatic  #73                 // Method java/lang/Integer.toBinaryString:(I)Ljava/lang/String;
      29: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      32: pop
      33: aload_2
      34: ldc           #75                 // String  but it is
      36: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_2
      41: aload_0
      42: getfield      #41                 // Field c:I
      45: invokestatic  #73                 // Method java/lang/Integer.toBinaryString:(I)Ljava/lang/String;
      48: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      51: pop
      52: new           #77                 // class java/lang/IllegalStateException
      55: dup
      56: aload_2
      57: invokevirtual #81                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      60: invokespecial #84                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      63: athrow
      64: return

  void a(android.support.v7.widget.RecyclerView$a);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #41                 // Field c:I
       5: aload_0
       6: aload_1
       7: invokevirtual #90                 // Method android/support/v7/widget/RecyclerView$a.a:()I
      10: putfield      #43                 // Field d:I
      13: aload_0
      14: iconst_0
      15: putfield      #47                 // Field f:Z
      18: aload_0
      19: iconst_0
      20: putfield      #49                 // Field g:Z
      23: aload_0
      24: iconst_0
      25: putfield      #51                 // Field h:Z
      28: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #47                 // Field f:Z
       4: ireturn

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #55                 // Field j:Z
       4: ireturn

  public int c();
    Code:
       0: aload_0
       1: getfield      #35                 // Field p:I
       4: ireturn

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #35                 // Field p:I
       4: iconst_m1
       5: if_icmpeq     10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn

  public int e();
    Code:
       0: aload_0
       1: getfield      #47                 // Field f:Z
       4: ifeq          17
       7: aload_0
       8: getfield      #37                 // Field a:I
      11: aload_0
      12: getfield      #39                 // Field b:I
      15: isub
      16: ireturn
      17: aload_0
      18: getfield      #43                 // Field d:I
      21: ireturn

  public java.lang.String toString();
    Code:
       0: new           #60                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #61                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #93                 // String State{mTargetPosition=
      11: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #35                 // Field p:I
      20: invokevirtual #96                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #98                 // String , mData=
      27: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #100                // Field q:Landroid/util/SparseArray;
      36: invokevirtual #103                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #105                // String , mItemCount=
      43: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: aload_0
      49: getfield      #43                 // Field d:I
      52: invokevirtual #96                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: ldc           #107                // String , mIsMeasuring=
      59: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_1
      64: aload_0
      65: getfield      #51                 // Field h:Z
      68: invokevirtual #110                // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
      71: pop
      72: aload_1
      73: ldc           #112                // String , mPreviousLayoutItemCount=
      75: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: aload_1
      80: aload_0
      81: getfield      #37                 // Field a:I
      84: invokevirtual #96                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      87: pop
      88: aload_1
      89: ldc           #114                // String , mDeletedInvisibleItemCountSincePreviousLayout=
      91: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: pop
      95: aload_1
      96: aload_0
      97: getfield      #39                 // Field b:I
     100: invokevirtual #96                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     103: pop
     104: aload_1
     105: ldc           #116                // String , mStructureChanged=
     107: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     110: pop
     111: aload_1
     112: aload_0
     113: getfield      #45                 // Field e:Z
     116: invokevirtual #110                // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
     119: pop
     120: aload_1
     121: ldc           #118                // String , mInPreLayout=
     123: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     126: pop
     127: aload_1
     128: aload_0
     129: getfield      #47                 // Field f:Z
     132: invokevirtual #110                // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
     135: pop
     136: aload_1
     137: ldc           #120                // String , mRunSimpleAnimations=
     139: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     142: pop
     143: aload_1
     144: aload_0
     145: getfield      #53                 // Field i:Z
     148: invokevirtual #110                // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
     151: pop
     152: aload_1
     153: ldc           #122                // String , mRunPredictiveAnimations=
     155: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     158: pop
     159: aload_1
     160: aload_0
     161: getfield      #55                 // Field j:Z
     164: invokevirtual #110                // Method java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
     167: pop
     168: aload_1
     169: bipush        125
     171: invokevirtual #125                // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     174: pop
     175: aload_1
     176: invokevirtual #81                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     179: areturn
}
