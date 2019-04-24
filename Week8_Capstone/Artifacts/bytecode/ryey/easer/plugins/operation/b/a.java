public class ryey.easer.plugins.operation.b.a extends ryey.easer.plugins.operation.c<ryey.easer.plugins.operation.b.b> {
  public ryey.easer.plugins.operation.b.a(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #9                  // Method ryey/easer/plugins/operation/c."<init>":(Landroid/content/Context;)V
       5: return

  public boolean a(ryey.easer.commons.local_plugin.c.b);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #14                 // class ryey/easer/plugins/operation/b/b
       5: invokevirtual #17                 // Method a:(Lryey/easer/plugins/operation/b/b;)Z
       8: ireturn

  public boolean a(ryey.easer.plugins.operation.b.b);
    Code:
       0: new           #19                 // class android/content/Intent
       3: dup
       4: ldc           #21                 // String android.intent.action.SET_ALARM
       6: invokespecial #24                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore        6
      11: aload_1
      12: getfield      #27                 // Field ryey/easer/plugins/operation/b/b.a:Ljava/util/Calendar;
      15: bipush        11
      17: invokevirtual #33                 // Method java/util/Calendar.get:(I)I
      20: istore        4
      22: aload_1
      23: getfield      #27                 // Field ryey/easer/plugins/operation/b/b.a:Ljava/util/Calendar;
      26: bipush        12
      28: invokevirtual #33                 // Method java/util/Calendar.get:(I)I
      31: istore_2
      32: iload         4
      34: istore_3
      35: iload_2
      36: istore        5
      38: aload_1
      39: getfield      #37                 // Field ryey/easer/plugins/operation/b/b.c:Z
      42: ifne          118
      45: invokestatic  #41                 // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      48: astore        7
      50: iload_2
      51: aload         7
      53: bipush        12
      55: invokevirtual #33                 // Method java/util/Calendar.get:(I)I
      58: iadd
      59: istore        5
      61: iload         4
      63: istore_3
      64: iload         5
      66: istore_2
      67: iload         5
      69: bipush        60
      71: if_icmplt     85
      74: iload         4
      76: iconst_1
      77: iadd
      78: istore_3
      79: iload         5
      81: bipush        60
      83: isub
      84: istore_2
      85: iload_3
      86: aload         7
      88: bipush        11
      90: invokevirtual #33                 // Method java/util/Calendar.get:(I)I
      93: iadd
      94: istore        4
      96: iload         4
      98: istore_3
      99: iload_2
     100: istore        5
     102: iload         4
     104: bipush        24
     106: if_icmplt     118
     109: iload         4
     111: bipush        24
     113: isub
     114: istore_3
     115: iload_2
     116: istore        5
     118: aload         6
     120: ldc           #43                 // String android.intent.extra.alarm.HOUR
     122: iload_3
     123: invokevirtual #47                 // Method android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
     126: pop
     127: aload         6
     129: ldc           #49                 // String android.intent.extra.alarm.MINUTES
     131: iload         5
     133: invokevirtual #47                 // Method android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
     136: pop
     137: aload         6
     139: ldc           #51                 // String android.intent.extra.alarm.MESSAGE
     141: aload_1
     142: getfield      #55                 // Field ryey/easer/plugins/operation/b/b.b:Ljava/lang/String;
     145: invokevirtual #58                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
     148: pop
     149: getstatic     #64                 // Field android/os/Build$VERSION.SDK_INT:I
     152: bipush        19
     154: if_icmplt     166
     157: aload         6
     159: ldc           #66                 // String android.intent.extra.alarm.VIBRATE
     161: iconst_1
     162: invokevirtual #69                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
     165: pop
     166: aload         6
     168: ldc           #71                 // String android.intent.extra.alarm.SKIP_UI
     170: iconst_1
     171: invokevirtual #69                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
     174: pop
     175: aload         6
     177: ldc           #72                 // int 268435456
     179: invokevirtual #76                 // Method android/content/Intent.addFlags:(I)Landroid/content/Intent;
     182: pop
     183: aload         6
     185: aload_0
     186: getfield      #79                 // Field a:Landroid/content/Context;
     189: invokevirtual #85                 // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
     192: invokevirtual #89                 // Method android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
     195: ifnull        209
     198: aload_0
     199: getfield      #79                 // Field a:Landroid/content/Context;
     202: aload         6
     204: invokevirtual #93                 // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
     207: iconst_1
     208: ireturn
     209: iconst_0
     210: ireturn
}
