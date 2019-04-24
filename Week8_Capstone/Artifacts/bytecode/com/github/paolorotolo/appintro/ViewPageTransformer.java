class com.github.paolorotolo.appintro.ViewPageTransformer implements android.support.v4.view.v$g {
  com.github.paolorotolo.appintro.ViewPageTransformer(com.github.paolorotolo.appintro.ViewPageTransformer$TransformType);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #30                 // Field mTransformType:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
       9: return

  public void transformPage(android.view.View, float);
    Code:
       0: getstatic     #37                 // Field com/github/paolorotolo/appintro/ViewPageTransformer$1.$SwitchMap$com$github$paolorotolo$appintro$ViewPageTransformer$TransformType:[I
       3: aload_0
       4: getfield      #30                 // Field mTransformType:Lcom/github/paolorotolo/appintro/ViewPageTransformer$TransformType;
       7: invokevirtual #41                 // Method com/github/paolorotolo/appintro/ViewPageTransformer$TransformType.ordinal:()I
      10: iaload
      11: istore        9
      13: fconst_0
      14: fstore_3
      15: fconst_1
      16: fstore        4
      18: iload         9
      20: tableswitch   { // 1 to 5
                     1: 381
                     2: 272
                     3: 226
                     4: 116
                     5: 57
               default: 56
          }
      56: return
      57: fload_2
      58: ldc           #42                 // float -1.0f
      60: fcmpg
      61: ifle          101
      64: fload_2
      65: fconst_1
      66: fcmpl
      67: iflt          73
      70: goto          101
      73: fload_2
      74: fconst_0
      75: fcmpl
      76: ifne          90
      79: aload_1
      80: fconst_1
      81: invokevirtual #48                 // Method android/view/View.setAlpha:(F)V
      84: iconst_1
      85: istore        10
      87: goto          109
      90: aload_1
      91: fconst_1
      92: fload_2
      93: invokestatic  #54                 // Method java/lang/Math.abs:(F)F
      96: fsub
      97: invokevirtual #48                 // Method android/view/View.setAlpha:(F)V
     100: return
     101: aload_1
     102: fconst_0
     103: invokevirtual #48                 // Method android/view/View.setAlpha:(F)V
     106: iconst_0
     107: istore        10
     109: aload_1
     110: iload         10
     112: invokevirtual #58                 // Method android/view/View.setClickable:(Z)V
     115: return
     116: fload_2
     117: ldc           #42                 // float -1.0f
     119: fcmpl
     120: iflt          357
     123: fload_2
     124: fconst_1
     125: fcmpg
     126: ifgt          357
     129: ldc           #20                 // float 0.85f
     131: fconst_1
     132: fload_2
     133: invokestatic  #54                 // Method java/lang/Math.abs:(F)F
     136: fsub
     137: invokestatic  #62                 // Method java/lang/Math.max:(FF)F
     140: fstore        4
     142: fload         4
     144: ldc           #20                 // float 0.85f
     146: fsub
     147: ldc           #63                 // float 0.14999998f
     149: fdiv
     150: fstore        5
     152: aload_1
     153: invokevirtual #66                 // Method android/view/View.getHeight:()I
     156: i2f
     157: fstore        6
     159: fconst_1
     160: fload         4
     162: fsub
     163: fstore_3
     164: fload         6
     166: fload_3
     167: fmul
     168: fconst_2
     169: fdiv
     170: fstore        6
     172: aload_1
     173: invokevirtual #69                 // Method android/view/View.getWidth:()I
     176: i2f
     177: fload_3
     178: fmul
     179: fconst_2
     180: fdiv
     181: fstore_3
     182: fload_2
     183: fconst_0
     184: fcmpg
     185: ifge          198
     188: fload_3
     189: fload         6
     191: fconst_2
     192: fdiv
     193: fsub
     194: fstore_3
     195: goto          206
     198: fload_3
     199: fneg
     200: fload         6
     202: fconst_2
     203: fdiv
     204: fadd
     205: fstore_3
     206: ldc           #16                 // float 0.5f
     208: fload         5
     210: ldc           #16                 // float 0.5f
     212: fmul
     213: fadd
     214: fstore        5
     216: fload         4
     218: fstore_2
     219: fload         5
     221: fstore        4
     223: goto          359
     226: fload_2
     227: fconst_0
     228: fcmpl
     229: ifle          357
     232: fload_2
     233: fconst_1
     234: fcmpg
     235: ifge          357
     238: fload_2
     239: invokestatic  #54                 // Method java/lang/Math.abs:(F)F
     242: fstore        5
     244: aload_1
     245: invokevirtual #69                 // Method android/view/View.getWidth:()I
     248: i2f
     249: fload_2
     250: fneg
     251: fmul
     252: fstore_3
     253: fconst_1
     254: fload_2
     255: fsub
     256: fstore        4
     258: fconst_1
     259: fload         5
     261: fsub
     262: ldc           #70                 // float 0.25f
     264: fmul
     265: ldc           #18                 // float 0.75f
     267: fadd
     268: fstore_2
     269: goto          359
     272: fload_2
     273: fconst_0
     274: fcmpg
     275: ifge          357
     278: fload_2
     279: ldc           #42                 // float -1.0f
     281: fcmpl
     282: ifle          357
     285: fload_2
     286: invokestatic  #54                 // Method java/lang/Math.abs:(F)F
     289: fconst_1
     290: fsub
     291: invokestatic  #54                 // Method java/lang/Math.abs:(F)F
     294: ldc           #63                 // float 0.14999998f
     296: fmul
     297: ldc           #20                 // float 0.85f
     299: fadd
     300: fstore        5
     302: ldc           #14                 // float 0.35f
     304: fconst_1
     305: fload_2
     306: invokestatic  #54                 // Method java/lang/Math.abs:(F)F
     309: fsub
     310: invokestatic  #62                 // Method java/lang/Math.max:(FF)F
     313: fstore        6
     315: aload_1
     316: invokevirtual #69                 // Method android/view/View.getWidth:()I
     319: ineg
     320: i2f
     321: fstore        8
     323: fload_2
     324: fload         8
     326: fmul
     327: fstore        7
     329: fload         5
     331: fstore_2
     332: fload         6
     334: fstore        4
     336: fload         7
     338: fload         8
     340: fcmpl
     341: ifle          359
     344: fload         7
     346: fstore_3
     347: fload         5
     349: fstore_2
     350: fload         6
     352: fstore        4
     354: goto          359
     357: fconst_1
     358: fstore_2
     359: aload_1
     360: fload         4
     362: invokevirtual #48                 // Method android/view/View.setAlpha:(F)V
     365: aload_1
     366: fload_3
     367: invokevirtual #73                 // Method android/view/View.setTranslationX:(F)V
     370: aload_1
     371: fload_2
     372: invokevirtual #76                 // Method android/view/View.setScaleX:(F)V
     375: aload_1
     376: fload_2
     377: invokevirtual #79                 // Method android/view/View.setScaleY:(F)V
     380: return
     381: aload_1
     382: fload_2
     383: ldc           #80                 // float -30.0f
     385: fmul
     386: invokevirtual #83                 // Method android/view/View.setRotationY:(F)V
     389: return
}
