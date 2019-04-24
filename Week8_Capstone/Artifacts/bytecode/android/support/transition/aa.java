public class android.support.transition.aa {
  public final java.util.Map<java.lang.String, java.lang.Object> a;

  public android.view.View b;

  final java.util.ArrayList<android.support.transition.u> c;

  public android.support.transition.aa();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #18                 // class java/util/HashMap
       8: dup
       9: invokespecial #19                 // Method java/util/HashMap."<init>":()V
      12: putfield      #21                 // Field a:Ljava/util/Map;
      15: aload_0
      16: new           #23                 // class java/util/ArrayList
      19: dup
      20: invokespecial #24                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #26                 // Field c:Ljava/util/ArrayList;
      26: return

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class android/support/transition/aa
       4: ifeq          43
       7: aload_0
       8: getfield      #31                 // Field b:Landroid/view/View;
      11: astore_2
      12: aload_1
      13: checkcast     #2                  // class android/support/transition/aa
      16: astore_1
      17: aload_2
      18: aload_1
      19: getfield      #31                 // Field b:Landroid/view/View;
      22: if_acmpne     43
      25: aload_0
      26: getfield      #21                 // Field a:Ljava/util/Map;
      29: aload_1
      30: getfield      #21                 // Field a:Ljava/util/Map;
      33: invokeinterface #35,  2           // InterfaceMethod java/util/Map.equals:(Ljava/lang/Object;)Z
      38: ifeq          43
      41: iconst_1
      42: ireturn
      43: iconst_0
      44: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #31                 // Field b:Landroid/view/View;
       4: invokevirtual #39                 // Method java/lang/Object.hashCode:()I
       7: bipush        31
       9: imul
      10: aload_0
      11: getfield      #21                 // Field a:Ljava/util/Map;
      14: invokeinterface #40,  1           // InterfaceMethod java/util/Map.hashCode:()I
      19: iadd
      20: ireturn

  public java.lang.String toString();
    Code:
       0: new           #44                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #45                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #47                 // String TransitionValues@
      11: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: invokevirtual #52                 // Method hashCode:()I
      20: invokestatic  #58                 // Method java/lang/Integer.toHexString:(I)Ljava/lang/String;
      23: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #60                 // String :\n
      30: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      38: astore_1
      39: new           #44                 // class java/lang/StringBuilder
      42: dup
      43: invokespecial #45                 // Method java/lang/StringBuilder."<init>":()V
      46: astore_2
      47: aload_2
      48: aload_1
      49: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload_2
      54: ldc           #64                 // String     view =
      56: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      59: pop
      60: aload_2
      61: aload_0
      62: getfield      #31                 // Field b:Landroid/view/View;
      65: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      68: pop
      69: aload_2
      70: ldc           #69                 // String \n
      72: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      75: pop
      76: aload_2
      77: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      80: astore_1
      81: new           #44                 // class java/lang/StringBuilder
      84: dup
      85: invokespecial #45                 // Method java/lang/StringBuilder."<init>":()V
      88: astore_2
      89: aload_2
      90: aload_1
      91: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: pop
      95: aload_2
      96: ldc           #71                 // String     values:
      98: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     101: pop
     102: aload_2
     103: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     106: astore_1
     107: aload_0
     108: getfield      #21                 // Field a:Ljava/util/Map;
     111: invokeinterface #75,  1           // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
     116: invokeinterface #81,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
     121: astore_2
     122: aload_2
     123: invokeinterface #87,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     128: ifeq          213
     131: aload_2
     132: invokeinterface #91,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     137: checkcast     #93                 // class java/lang/String
     140: astore_3
     141: new           #44                 // class java/lang/StringBuilder
     144: dup
     145: invokespecial #45                 // Method java/lang/StringBuilder."<init>":()V
     148: astore        4
     150: aload         4
     152: aload_1
     153: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     156: pop
     157: aload         4
     159: ldc           #95                 // String
     161: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     164: pop
     165: aload         4
     167: aload_3
     168: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     171: pop
     172: aload         4
     174: ldc           #97                 // String :
     176: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     179: pop
     180: aload         4
     182: aload_0
     183: getfield      #21                 // Field a:Ljava/util/Map;
     186: aload_3
     187: invokeinterface #101,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
     192: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
     195: pop
     196: aload         4
     198: ldc           #69                 // String \n
     200: invokevirtual #51                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
     203: pop
     204: aload         4
     206: invokevirtual #62                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     209: astore_1
     210: goto          122
     213: aload_1
     214: areturn
}
