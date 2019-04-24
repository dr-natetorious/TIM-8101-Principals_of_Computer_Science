public class ryey.easer.b {
  public static final java.text.DateFormat a;

  public static final java.text.DateFormat b;

  static {};
    Code:
       0: new           #13                 // class java/text/SimpleDateFormat
       3: dup
       4: ldc           #15                 // String yyyy-MM-dd HH:mm:ss
       6: getstatic     #21                 // Field java/util/Locale.US:Ljava/util/Locale;
       9: invokespecial #25                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      12: putstatic     #27                 // Field a:Ljava/text/DateFormat;
      15: new           #13                 // class java/text/SimpleDateFormat
      18: dup
      19: ldc           #29                 // String yyyy-MM-dd h:mm:ss a
      21: getstatic     #21                 // Field java/util/Locale.US:Ljava/util/Locale;
      24: invokespecial #25                 // Method java/text/SimpleDateFormat."<init>":(Ljava/lang/String;Ljava/util/Locale;)V
      27: putstatic     #31                 // Field b:Ljava/text/DateFormat;
      30: ldc           #33                 // String <<[^ ]+>>
      32: invokestatic  #39                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
      35: putstatic     #41                 // Field c:Ljava/util/regex/Pattern;
      38: return

  public static int a(android.widget.CompoundButton[]);
    Code:
       0: iconst_0
       1: istore_1
       2: iload_1
       3: aload_0
       4: arraylength
       5: if_icmpge     26
       8: aload_0
       9: iload_1
      10: aaload
      11: invokevirtual #49                 // Method android/widget/CompoundButton.isChecked:()Z
      14: ifeq          19
      17: iload_1
      18: ireturn
      19: iload_1
      20: iconst_1
      21: iadd
      22: istore_1
      23: goto          2
      26: new           #51                 // class java/lang/IllegalStateException
      29: dup
      30: ldc           #53                 // String At least one button should be checked
      32: invokespecial #56                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      35: athrow

  public static java.lang.String a(java.lang.String, ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: invokestatic  #60                 // Method c:(Ljava/lang/String;)Ljava/util/Set;
       4: invokeinterface #66,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
       9: astore_2
      10: aload_2
      11: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          43
      19: aload_2
      20: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #77                 // class java/lang/String
      28: astore_3
      29: aload_0
      30: aload_3
      31: aload_1
      32: aload_3
      33: invokevirtual #82                 // Method ryey/easer/commons/local_plugin/b/c.a:(Ljava/lang/String;)Ljava/lang/String;
      36: invokevirtual #86                 // Method java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      39: astore_0
      40: goto          10
      43: aload_0
      44: areturn

  public static java.lang.String a(java.util.Collection<java.lang.String>, boolean);
    Code:
       0: aload_0
       1: ifnonnull     7
       4: ldc           #89                 // String
       6: areturn
       7: new           #91                 // class java/lang/StringBuilder
      10: dup
      11: invokespecial #93                 // Method java/lang/StringBuilder."<init>":()V
      14: astore_3
      15: iconst_1
      16: istore_2
      17: aload_0
      18: invokeinterface #96,  1           // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
      23: astore_0
      24: aload_0
      25: invokeinterface #71,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      30: ifeq          78
      33: aload_0
      34: invokeinterface #75,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      39: checkcast     #77                 // class java/lang/String
      42: invokevirtual #100                // Method java/lang/String.trim:()Ljava/lang/String;
      45: astore        4
      47: aload         4
      49: invokevirtual #103                // Method java/lang/String.isEmpty:()Z
      52: ifne          24
      55: iload_2
      56: ifne          66
      59: aload_3
      60: ldc           #105                // String \n
      62: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      65: pop
      66: aload_3
      67: aload         4
      69: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      72: pop
      73: iconst_0
      74: istore_2
      75: goto          24
      78: iload_2
      79: ifne          93
      82: iload_1
      83: ifeq          93
      86: aload_3
      87: ldc           #105                // String \n
      89: invokevirtual #109                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      92: pop
      93: aload_3
      94: invokevirtual #112                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      97: areturn

  public static void a(java.lang.String, java.lang.Object...);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #119                // Method com/b/a/i.b:(Ljava/lang/String;[Ljava/lang/Object;)V
       5: new           #51                 // class java/lang/IllegalStateException
       8: dup
       9: aload_0
      10: aload_1
      11: invokestatic  #123                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      14: invokespecial #56                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow

  public static boolean a(android.content.Context, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #129                // Method android/support/v4/a/a.a:(Landroid/content/Context;Ljava/lang/String;)I
       5: ifeq          35
       8: aload_0
       9: aload_0
      10: ldc           #130                // int 2131624242
      12: invokevirtual #136                // Method android/content/Context.getString:(I)Ljava/lang/String;
      15: iconst_1
      16: anewarray     #4                  // class java/lang/Object
      19: dup
      20: iconst_0
      21: aload_1
      22: aastore
      23: invokestatic  #123                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      26: iconst_1
      27: invokestatic  #142                // Method android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
      30: invokevirtual #145                // Method android/widget/Toast.show:()V
      33: iconst_0
      34: ireturn
      35: iconst_1
      36: ireturn

  public static boolean a(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: ifnonnull     10
       4: aload_1
       5: ifnonnull     10
       8: iconst_1
       9: ireturn
      10: aload_0
      11: ifnull        27
      14: aload_1
      15: ifnonnull     21
      18: goto          27
      21: aload_0
      22: aload_1
      23: invokevirtual #150                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      26: ireturn
      27: iconst_0
      28: ireturn

  public static boolean a(java.lang.String);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: iconst_1
       5: ireturn
       6: aload_0
       7: invokevirtual #103                // Method java/lang/String.isEmpty:()Z
      10: ifeq          15
      13: iconst_1
      14: ireturn
      15: aload_0
      16: invokevirtual #100                // Method java/lang/String.trim:()Ljava/lang/String;
      19: invokevirtual #103                // Method java/lang/String.isEmpty:()Z
      22: ifeq          27
      25: iconst_1
      26: ireturn
      27: iconst_0
      28: ireturn

  public static java.util.List<java.lang.String> b(java.lang.String);
    Code:
       0: new           #154                // class java/util/ArrayList
       3: dup
       4: invokespecial #155                // Method java/util/ArrayList."<init>":()V
       7: astore_3
       8: aload_0
       9: ldc           #105                // String \n
      11: invokevirtual #159                // Method java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
      14: astore_0
      15: aload_0
      16: arraylength
      17: istore_2
      18: iconst_0
      19: istore_1
      20: iload_1
      21: iload_2
      22: if_icmpge     57
      25: aload_0
      26: iload_1
      27: aaload
      28: invokevirtual #100                // Method java/lang/String.trim:()Ljava/lang/String;
      31: astore        4
      33: aload         4
      35: invokevirtual #103                // Method java/lang/String.isEmpty:()Z
      38: ifne          50
      41: aload_3
      42: aload         4
      44: invokeinterface #164,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      49: pop
      50: iload_1
      51: iconst_1
      52: iadd
      53: istore_1
      54: goto          20
      57: aload_3
      58: areturn

  public static java.util.Set<java.lang.String> c(java.lang.String);
    Code:
       0: new           #167                // class android/support/v4/g/b
       3: dup
       4: invokespecial #168                // Method android/support/v4/g/b."<init>":()V
       7: astore_1
       8: getstatic     #41                 // Field c:Ljava/util/regex/Pattern;
      11: aload_0
      12: invokevirtual #172                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      15: astore_0
      16: aload_0
      17: invokevirtual #177                // Method java/util/regex/Matcher.find:()Z
      20: ifeq          37
      23: aload_1
      24: aload_0
      25: invokevirtual #180                // Method java/util/regex/Matcher.group:()Ljava/lang/String;
      28: invokeinterface #181,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      33: pop
      34: goto          16
      37: aload_1
      38: areturn
}
