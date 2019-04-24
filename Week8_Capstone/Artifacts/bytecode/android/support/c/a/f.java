public class android.support.c.a.f implements android.animation.TypeEvaluator {
  static {};
    Code:
       0: new           #2                  // class android/support/c/a/f
       3: dup
       4: invokespecial #13                 // Method "<init>":()V
       7: putstatic     #15                 // Field a:Landroid/support/c/a/f;
      10: return

  public android.support.c.a.f();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: return

  public static android.support.c.a.f a();
    Code:
       0: getstatic     #15                 // Field a:Landroid/support/c/a/f;
       3: areturn

  public java.lang.Object evaluate(float, java.lang.Object, java.lang.Object);
    Code:
       0: aload_2
       1: checkcast     #22                 // class java/lang/Integer
       4: invokevirtual #26                 // Method java/lang/Integer.intValue:()I
       7: istore        12
       9: iload         12
      11: bipush        24
      13: ishr
      14: sipush        255
      17: iand
      18: i2f
      19: ldc           #27                 // float 255.0f
      21: fdiv
      22: fstore        4
      24: iload         12
      26: bipush        16
      28: ishr
      29: sipush        255
      32: iand
      33: i2f
      34: ldc           #27                 // float 255.0f
      36: fdiv
      37: fstore        7
      39: iload         12
      41: bipush        8
      43: ishr
      44: sipush        255
      47: iand
      48: i2f
      49: ldc           #27                 // float 255.0f
      51: fdiv
      52: fstore        8
      54: iload         12
      56: sipush        255
      59: iand
      60: i2f
      61: ldc           #27                 // float 255.0f
      63: fdiv
      64: fstore        9
      66: aload_3
      67: checkcast     #22                 // class java/lang/Integer
      70: invokevirtual #26                 // Method java/lang/Integer.intValue:()I
      73: istore        12
      75: iload         12
      77: bipush        24
      79: ishr
      80: sipush        255
      83: iand
      84: i2f
      85: ldc           #27                 // float 255.0f
      87: fdiv
      88: fstore        5
      90: iload         12
      92: bipush        16
      94: ishr
      95: sipush        255
      98: iand
      99: i2f
     100: ldc           #27                 // float 255.0f
     102: fdiv
     103: fstore        11
     105: iload         12
     107: bipush        8
     109: ishr
     110: sipush        255
     113: iand
     114: i2f
     115: ldc           #27                 // float 255.0f
     117: fdiv
     118: fstore        10
     120: iload         12
     122: sipush        255
     125: iand
     126: i2f
     127: ldc           #27                 // float 255.0f
     129: fdiv
     130: fstore        6
     132: fload         7
     134: f2d
     135: ldc2_w        #28                 // double 2.2d
     138: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     141: d2f
     142: fstore        7
     144: fload         8
     146: f2d
     147: ldc2_w        #28                 // double 2.2d
     150: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     153: d2f
     154: fstore        8
     156: fload         9
     158: f2d
     159: ldc2_w        #28                 // double 2.2d
     162: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     165: d2f
     166: fstore        9
     168: fload         11
     170: f2d
     171: ldc2_w        #28                 // double 2.2d
     174: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     177: d2f
     178: fstore        11
     180: fload         10
     182: f2d
     183: ldc2_w        #28                 // double 2.2d
     186: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     189: d2f
     190: fstore        10
     192: fload         6
     194: f2d
     195: ldc2_w        #28                 // double 2.2d
     198: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     201: d2f
     202: fstore        6
     204: fload         7
     206: fload         11
     208: fload         7
     210: fsub
     211: fload_1
     212: fmul
     213: fadd
     214: f2d
     215: ldc2_w        #36                 // double 0.45454545454545453d
     218: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     221: d2f
     222: fstore        7
     224: fload         8
     226: fload         10
     228: fload         8
     230: fsub
     231: fload_1
     232: fmul
     233: fadd
     234: f2d
     235: ldc2_w        #36                 // double 0.45454545454545453d
     238: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     241: d2f
     242: fstore        8
     244: fload         9
     246: fload_1
     247: fload         6
     249: fload         9
     251: fsub
     252: fmul
     253: fadd
     254: f2d
     255: ldc2_w        #36                 // double 0.45454545454545453d
     258: invokestatic  #35                 // Method java/lang/Math.pow:(DD)D
     261: d2f
     262: fstore        6
     264: fload         4
     266: fload         5
     268: fload         4
     270: fsub
     271: fload_1
     272: fmul
     273: fadd
     274: ldc           #27                 // float 255.0f
     276: fmul
     277: invokestatic  #41                 // Method java/lang/Math.round:(F)I
     280: istore        12
     282: fload         7
     284: ldc           #27                 // float 255.0f
     286: fmul
     287: invokestatic  #41                 // Method java/lang/Math.round:(F)I
     290: bipush        16
     292: ishl
     293: iload         12
     295: bipush        24
     297: ishl
     298: ior
     299: fload         8
     301: ldc           #27                 // float 255.0f
     303: fmul
     304: invokestatic  #41                 // Method java/lang/Math.round:(F)I
     307: bipush        8
     309: ishl
     310: ior
     311: fload         6
     313: ldc           #27                 // float 255.0f
     315: fmul
     316: invokestatic  #41                 // Method java/lang/Math.round:(F)I
     319: ior
     320: invokestatic  #45                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     323: areturn
}
