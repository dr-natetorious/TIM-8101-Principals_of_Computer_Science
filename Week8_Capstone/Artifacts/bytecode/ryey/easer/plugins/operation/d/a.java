public class ryey.easer.plugins.operation.d.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.d.b> {
  public ryey.easer.plugins.operation.d.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #89                 // class ryey/easer/plugins/operation/d/b
       5: invokevirtual #92                 // Method a:(Lryey/easer/plugins/operation/d/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.d.b);
    Code:
       0: aload_1
       1: getfield      #95                 // Field ryey/easer/plugins/operation/d/b.a:Lryey/easer/plugins/operation/d/f;
       4: invokestatic  #97                 // Method a:(Lryey/easer/plugins/operation/d/f;)Lryey/easer/plugins/operation/d/f;
       7: astore        5
       9: new           #99                 // class android/content/Intent
      12: dup
      13: invokespecial #100                // Method android/content/Intent."<init>":()V
      16: astore_1
      17: aload_1
      18: aload         5
      20: getfield      #20                 // Field ryey/easer/plugins/operation/d/f.a:Ljava/lang/String;
      23: invokevirtual #104                // Method android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
      26: pop
      27: aload         5
      29: getfield      #24                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      32: ifnull        75
      35: aload         5
      37: getfield      #24                 // Field ryey/easer/plugins/operation/d/f.b:Ljava/util/List;
      40: invokeinterface #63,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      45: astore        4
      47: aload         4
      49: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      54: ifeq          75
      57: aload_1
      58: aload         4
      60: invokeinterface #73,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      65: checkcast     #106                // class java/lang/String
      68: invokevirtual #109                // Method android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
      71: pop
      72: goto          47
      75: aload         5
      77: getfield      #42                 // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
      80: invokestatic  #114                // Method ryey/easer/b.a:(Ljava/lang/String;)Z
      83: iconst_1
      84: ixor
      85: istore_3
      86: aload         5
      88: getfield      #46                 // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
      91: ifnull        113
      94: aload         5
      96: getfield      #46                 // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
      99: invokevirtual #117                // Method android/net/Uri.toString:()Ljava/lang/String;
     102: invokestatic  #114                // Method ryey/easer/b.a:(Ljava/lang/String;)Z
     105: ifne          113
     108: iconst_1
     109: istore_2
     110: goto          115
     113: iconst_0
     114: istore_2
     115: iload_3
     116: ifeq          141
     119: iload_2
     120: ifeq          141
     123: aload_1
     124: aload         5
     126: getfield      #46                 // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     129: aload         5
     131: getfield      #42                 // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     134: invokevirtual #121                // Method android/content/Intent.setDataAndType:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
     137: pop
     138: goto          172
     141: iload_3
     142: ifeq          158
     145: aload_1
     146: aload         5
     148: getfield      #42                 // Field ryey/easer/plugins/operation/d/f.c:Ljava/lang/String;
     151: invokevirtual #124                // Method android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
     154: pop
     155: goto          172
     158: iload_2
     159: ifeq          172
     162: aload_1
     163: aload         5
     165: getfield      #46                 // Field ryey/easer/plugins/operation/d/f.d:Landroid/net/Uri;
     168: invokevirtual #128                // Method android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
     171: pop
     172: aload         5
     174: getfield      #59                 // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     177: ifnull        353
     180: new           #130                // class android/os/Bundle
     183: dup
     184: invokespecial #131                // Method android/os/Bundle."<init>":()V
     187: astore        4
     189: aload         5
     191: getfield      #59                 // Field ryey/easer/plugins/operation/d/f.e:Ljava/util/List;
     194: invokeinterface #63,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     199: astore        5
     201: aload         5
     203: invokeinterface #69,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     208: ifeq          346
     211: aload         5
     213: invokeinterface #73,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     218: checkcast     #75                 // class ryey/easer/plugins/operation/d/f$a
     221: astore        6
     223: aload         6
     225: getfield      #79                 // Field ryey/easer/plugins/operation/d/f$a.c:Ljava/lang/String;
     228: astore        7
     230: iconst_m1
     231: istore_2
     232: aload         7
     234: invokevirtual #134                // Method java/lang/String.hashCode:()I
     237: istore_3
     238: iload_3
     239: ldc           #135                // int -891985903
     241: if_icmpeq     268
     244: iload_3
     245: ldc           #136                // int 104431
     247: if_icmpeq     253
     250: goto          280
     253: aload         7
     255: ldc           #138                // String int
     257: invokevirtual #141                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     260: ifeq          280
     263: iconst_1
     264: istore_2
     265: goto          280
     268: aload         7
     270: ldc           #143                // String string
     272: invokevirtual #141                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     275: ifeq          280
     278: iconst_0
     279: istore_2
     280: iload_2
     281: tableswitch   { // 0 to 1
                     0: 328
                     1: 307
               default: 304
          }
     304: goto          201
     307: aload         4
     309: aload         6
     311: getfield      #76                 // Field ryey/easer/plugins/operation/d/f$a.a:Ljava/lang/String;
     314: aload         6
     316: getfield      #78                 // Field ryey/easer/plugins/operation/d/f$a.b:Ljava/lang/String;
     319: invokestatic  #149                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
     322: invokevirtual #153                // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
     325: goto          201
     328: aload         4
     330: aload         6
     332: getfield      #76                 // Field ryey/easer/plugins/operation/d/f$a.a:Ljava/lang/String;
     335: aload         6
     337: getfield      #78                 // Field ryey/easer/plugins/operation/d/f$a.b:Ljava/lang/String;
     340: invokevirtual #157                // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
     343: goto          201
     346: aload_1
     347: aload         4
     349: invokevirtual #161                // Method android/content/Intent.putExtras:(Landroid/os/Bundle;)Landroid/content/Intent;
     352: pop
     353: aload_0
     354: getfield      #164                // Field a:Landroid/content/Context;
     357: aload_1
     358: invokevirtual #170                // Method android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
     361: iconst_1
     362: ireturn
}
