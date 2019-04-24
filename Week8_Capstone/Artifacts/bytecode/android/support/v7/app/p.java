class android.support.v7.app.p {
  public long a;

  public long b;

  public int c;

  android.support.v7.app.p();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: return

  static android.support.v7.app.p a();
    Code:
       0: getstatic     #19                 // Field d:Landroid/support/v7/app/p;
       3: ifnonnull     16
       6: new           #2                  // class android/support/v7/app/p
       9: dup
      10: invokespecial #20                 // Method "<init>":()V
      13: putstatic     #19                 // Field d:Landroid/support/v7/app/p;
      16: getstatic     #19                 // Field d:Landroid/support/v7/app/p;
      19: areturn

  public void a(long, double, double);
    Code:
       0: lload_1
       1: ldc2_w        #22                 // long 946728000000l
       4: lsub
       5: l2f
       6: ldc           #24                 // float 8.64E7f
       8: fdiv
       9: fstore        11
      11: ldc           #25                 // float 0.01720197f
      13: fload         11
      15: fmul
      16: ldc           #26                 // float 6.24006f
      18: fadd
      19: fstore        12
      21: fload         12
      23: f2d
      24: dstore        9
      26: dload         9
      28: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
      31: ldc2_w        #33                 // double 0.03341960161924362d
      34: dmul
      35: dload         9
      37: dadd
      38: fconst_2
      39: fload         12
      41: fmul
      42: f2d
      43: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
      46: ldc2_w        #35                 // double 3.4906598739326E-4d
      49: dmul
      50: dadd
      51: fload         12
      53: ldc           #37                 // float 3.0f
      55: fmul
      56: f2d
      57: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
      60: ldc2_w        #38                 // double 5.236000106378924E-6d
      63: dmul
      64: dadd
      65: ldc2_w        #40                 // double 1.796593063d
      68: dadd
      69: ldc2_w        #42                 // double 3.141592653589793d
      72: dadd
      73: dstore        7
      75: dload         5
      77: dneg
      78: ldc2_w        #44                 // double 360.0d
      81: ddiv
      82: dstore        5
      84: fload         11
      86: ldc           #46                 // float 9.0E-4f
      88: fsub
      89: f2d
      90: dload         5
      92: dsub
      93: invokestatic  #50                 // Method java/lang/Math.round:(D)J
      96: l2f
      97: ldc           #46                 // float 9.0E-4f
      99: fadd
     100: f2d
     101: dload         5
     103: dadd
     104: dload         9
     106: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
     109: ldc2_w        #51                 // double 0.0053d
     112: dmul
     113: dadd
     114: ldc2_w        #53                 // double 2.0d
     117: dload         7
     119: dmul
     120: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
     123: ldc2_w        #55                 // double -0.0069d
     126: dmul
     127: dadd
     128: dstore        5
     130: dload         7
     132: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
     135: ldc2_w        #57                 // double 0.4092797040939331d
     138: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
     141: dmul
     142: invokestatic  #61                 // Method java/lang/Math.asin:(D)D
     145: dstore        7
     147: ldc2_w        #62                 // double 0.01745329238474369d
     150: dload_3
     151: dmul
     152: dstore_3
     153: ldc2_w        #64                 // double -0.10471975803375244d
     156: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
     159: dload_3
     160: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
     163: dload         7
     165: invokestatic  #32                 // Method java/lang/Math.sin:(D)D
     168: dmul
     169: dsub
     170: dload_3
     171: invokestatic  #68                 // Method java/lang/Math.cos:(D)D
     174: dload         7
     176: invokestatic  #68                 // Method java/lang/Math.cos:(D)D
     179: dmul
     180: ddiv
     181: dstore_3
     182: dload_3
     183: dconst_1
     184: dcmpl
     185: iflt          208
     188: aload_0
     189: iconst_1
     190: putfield      #70                 // Field c:I
     193: aload_0
     194: ldc2_w        #71                 // long -1l
     197: putfield      #74                 // Field a:J
     200: aload_0
     201: ldc2_w        #71                 // long -1l
     204: putfield      #76                 // Field b:J
     207: return
     208: dload_3
     209: ldc2_w        #77                 // double -1.0d
     212: dcmpg
     213: ifgt          224
     216: aload_0
     217: iconst_0
     218: putfield      #70                 // Field c:I
     221: goto          193
     224: dload_3
     225: invokestatic  #81                 // Method java/lang/Math.acos:(D)D
     228: ldc2_w        #82                 // double 6.283185307179586d
     231: ddiv
     232: d2f
     233: f2d
     234: dstore_3
     235: aload_0
     236: dload         5
     238: dload_3
     239: dadd
     240: ldc2_w        #84                 // double 8.64E7d
     243: dmul
     244: invokestatic  #50                 // Method java/lang/Math.round:(D)J
     247: ldc2_w        #22                 // long 946728000000l
     250: ladd
     251: putfield      #74                 // Field a:J
     254: aload_0
     255: dload         5
     257: dload_3
     258: dsub
     259: ldc2_w        #84                 // double 8.64E7d
     262: dmul
     263: invokestatic  #50                 // Method java/lang/Math.round:(D)J
     266: ldc2_w        #22                 // long 946728000000l
     269: ladd
     270: putfield      #76                 // Field b:J
     273: aload_0
     274: getfield      #76                 // Field b:J
     277: lload_1
     278: lcmp
     279: ifge          297
     282: aload_0
     283: getfield      #74                 // Field a:J
     286: lload_1
     287: lcmp
     288: ifle          297
     291: iconst_0
     292: istore        13
     294: goto          300
     297: iconst_1
     298: istore        13
     300: aload_0
     301: iload         13
     303: putfield      #70                 // Field c:I
     306: return
}
