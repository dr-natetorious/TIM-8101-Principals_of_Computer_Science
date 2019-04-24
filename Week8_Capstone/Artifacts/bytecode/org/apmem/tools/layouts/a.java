class org.apmem.tools.layouts.a {
  public org.apmem.tools.layouts.a(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #19                 // Field a:I
       9: aload_0
      10: iconst_0
      11: putfield      #21                 // Field b:Z
      14: aload_0
      15: fconst_0
      16: putfield      #23                 // Field c:F
      19: aload_0
      20: bipush        51
      22: putfield      #25                 // Field d:I
      25: aload_0
      26: iconst_0
      27: putfield      #27                 // Field e:I
      30: aload_1
      31: aload_2
      32: getstatic     #33                 // Field org/apmem/tools/layouts/c$a.FlowLayout:[I
      35: invokevirtual #39                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      38: astore_1
      39: aload_0
      40: aload_1
      41: getstatic     #42                 // Field org/apmem/tools/layouts/c$a.FlowLayout_android_orientation:I
      44: iconst_0
      45: invokevirtual #48                 // Method android/content/res/TypedArray.getInteger:(II)I
      48: invokevirtual #51                 // Method a:(I)V
      51: aload_0
      52: aload_1
      53: getstatic     #54                 // Field org/apmem/tools/layouts/c$a.FlowLayout_debugDraw:I
      56: iconst_0
      57: invokevirtual #58                 // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      60: invokevirtual #61                 // Method a:(Z)V
      63: aload_0
      64: aload_1
      65: getstatic     #64                 // Field org/apmem/tools/layouts/c$a.FlowLayout_weightDefault:I
      68: fconst_0
      69: invokevirtual #68                 // Method android/content/res/TypedArray.getFloat:(IF)F
      72: invokevirtual #71                 // Method a:(F)V
      75: aload_0
      76: aload_1
      77: getstatic     #74                 // Field org/apmem/tools/layouts/c$a.FlowLayout_android_gravity:I
      80: iconst_0
      81: invokevirtual #48                 // Method android/content/res/TypedArray.getInteger:(II)I
      84: invokevirtual #76                 // Method b:(I)V
      87: aload_0
      88: aload_1
      89: getstatic     #79                 // Field org/apmem/tools/layouts/c$a.FlowLayout_layoutDirection:I
      92: iconst_0
      93: invokevirtual #48                 // Method android/content/res/TypedArray.getInteger:(II)I
      96: invokevirtual #81                 // Method c:(I)V
      99: aload_1
     100: invokevirtual #84                 // Method android/content/res/TypedArray.recycle:()V
     103: return
     104: astore_2
     105: aload_1
     106: invokevirtual #84                 // Method android/content/res/TypedArray.recycle:()V
     109: aload_2
     110: athrow
    Exception table:
       from    to  target type
          39    99   104   any

  public int a();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:I
       4: ireturn

  public void a(float);
    Code:
       0: aload_0
       1: fconst_0
       2: fload_1
       3: invokestatic  #92                 // Method java/lang/Math.max:(FF)F
       6: putfield      #23                 // Field c:F
       9: return

  public void a(int);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpne     11
       5: aload_0
       6: iload_1
       7: putfield      #19                 // Field a:I
      10: return
      11: iconst_0
      12: istore_1
      13: goto          5

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #21                 // Field b:Z
       5: return

  public void b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #25                 // Field d:I
       5: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #21                 // Field b:Z
       4: ireturn

  public float c();
    Code:
       0: aload_0
       1: getfield      #23                 // Field c:F
       4: freturn

  public void c(int);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpne     11
       5: aload_0
       6: iload_1
       7: putfield      #27                 // Field e:I
      10: return
      11: iconst_0
      12: istore_1
      13: goto          5

  public int d();
    Code:
       0: aload_0
       1: getfield      #25                 // Field d:I
       4: ireturn

  public int e();
    Code:
       0: aload_0
       1: getfield      #27                 // Field e:I
       4: ireturn
}
