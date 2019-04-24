public class de.blox.graphview.e {
  public de.blox.graphview.e();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #19                 // class java/util/ArrayList
       8: dup
       9: invokespecial #20                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #22                 // Field a:Ljava/util/List;
      15: aload_0
      16: new           #19                 // class java/util/ArrayList
      19: dup
      20: invokespecial #20                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #24                 // Field b:Ljava/util/List;
      26: aload_0
      27: new           #19                 // class java/util/ArrayList
      30: dup
      31: invokespecial #20                 // Method java/util/ArrayList."<init>":()V
      34: putfield      #26                 // Field c:Ljava/util/List;
      37: aload_0
      38: iconst_0
      39: putfield      #28                 // Field d:Z
      42: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Ljava/util/List;
       4: invokeinterface #35,  1           // InterfaceMethod java/util/List.size:()I
       9: ireturn

  public de.blox.graphview.d a(de.blox.graphview.h, de.blox.graphview.h);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #39                 // Method a:(Lde/blox/graphview/h;)V
       5: aload_0
       6: aload_2
       7: invokevirtual #39                 // Method a:(Lde/blox/graphview/h;)V
      10: new           #41                 // class de/blox/graphview/d
      13: dup
      14: aload_1
      15: aload_2
      16: invokespecial #44                 // Method de/blox/graphview/d."<init>":(Lde/blox/graphview/h;Lde/blox/graphview/h;)V
      19: astore_1
      20: aload_0
      21: getfield      #24                 // Field b:Ljava/util/List;
      24: aload_1
      25: invokeinterface #48,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      30: pop
      31: aload_0
      32: getfield      #26                 // Field c:Ljava/util/List;
      35: invokeinterface #52,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      40: astore_2
      41: aload_2
      42: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      47: ifeq          67
      50: aload_2
      51: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      56: checkcast     #64                 // class de/blox/graphview/i
      59: invokeinterface #66,  1           // InterfaceMethod de/blox/graphview/i.d:()V
      64: goto          41
      67: aload_1
      68: areturn

  public de.blox.graphview.h a(int);
    Code:
       0: iload_1
       1: ifge          14
       4: new           #69                 // class java/lang/IllegalArgumentException
       7: dup
       8: ldc           #71                 // String position can't be negative
      10: invokespecial #74                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      13: athrow
      14: aload_0
      15: getfield      #22                 // Field a:Ljava/util/List;
      18: invokeinterface #35,  1           // InterfaceMethod java/util/List.size:()I
      23: istore_2
      24: iload_1
      25: iload_2
      26: if_icmplt     75
      29: new           #76                 // class java/lang/StringBuilder
      32: dup
      33: invokespecial #77                 // Method java/lang/StringBuilder."<init>":()V
      36: astore_3
      37: aload_3
      38: ldc           #79                 // String Position:
      40: invokevirtual #83                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      43: pop
      44: aload_3
      45: iload_1
      46: invokevirtual #86                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      49: pop
      50: aload_3
      51: ldc           #88                 // String , Size:
      53: invokevirtual #83                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      56: pop
      57: aload_3
      58: iload_2
      59: invokevirtual #86                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      62: pop
      63: new           #90                 // class java/lang/IndexOutOfBoundsException
      66: dup
      67: aload_3
      68: invokevirtual #94                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      71: invokespecial #95                 // Method java/lang/IndexOutOfBoundsException."<init>":(Ljava/lang/String;)V
      74: athrow
      75: aload_0
      76: getfield      #22                 // Field a:Ljava/util/List;
      79: iload_1
      80: invokeinterface #99,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      85: checkcast     #101                // class de/blox/graphview/h
      88: areturn

  public void a(de.blox.graphview.h);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Ljava/util/List;
       4: aload_1
       5: invokeinterface #104,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
      10: ifne          24
      13: aload_0
      14: getfield      #22                 // Field a:Ljava/util/List;
      17: aload_1
      18: invokeinterface #48,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      23: pop
      24: return

  public void a(de.blox.graphview.i);
    Code:
       0: aload_0
       1: getfield      #26                 // Field c:Ljava/util/List;
       4: aload_1
       5: invokeinterface #48,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      10: pop
      11: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #28                 // Field d:Z
       5: return

  public java.util.List<de.blox.graphview.h> b();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Ljava/util/List;
       4: invokestatic  #113                // Method java/util/Collections.unmodifiableList:(Ljava/util/List;)Ljava/util/List;
       7: areturn

  public void b(de.blox.graphview.i);
    Code:
       0: aload_0
       1: getfield      #26                 // Field c:Ljava/util/List;
       4: aload_1
       5: invokeinterface #118,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
      10: pop
      11: return

  public boolean b(de.blox.graphview.h);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Ljava/util/List;
       4: invokeinterface #52,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
       9: astore_2
      10: aload_2
      11: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      16: ifeq          40
      19: aload_2
      20: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      25: checkcast     #41                 // class de/blox/graphview/d
      28: invokevirtual #122                // Method de/blox/graphview/d.a:()Lde/blox/graphview/h;
      31: aload_1
      32: invokevirtual #125                // Method de/blox/graphview/h.equals:(Ljava/lang/Object;)Z
      35: ifeq          10
      38: iconst_1
      39: ireturn
      40: iconst_0
      41: ireturn

  public java.util.List<de.blox.graphview.h> c(de.blox.graphview.h);
    Code:
       0: new           #19                 // class java/util/ArrayList
       3: dup
       4: invokespecial #20                 // Method java/util/ArrayList."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #24                 // Field b:Ljava/util/List;
      12: invokeinterface #52,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      17: astore_3
      18: aload_3
      19: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      24: ifeq          65
      27: aload_3
      28: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      33: checkcast     #41                 // class de/blox/graphview/d
      36: astore        4
      38: aload         4
      40: invokevirtual #122                // Method de/blox/graphview/d.a:()Lde/blox/graphview/h;
      43: aload_1
      44: invokevirtual #125                // Method de/blox/graphview/h.equals:(Ljava/lang/Object;)Z
      47: ifeq          18
      50: aload_2
      51: aload         4
      53: invokevirtual #128                // Method de/blox/graphview/d.b:()Lde/blox/graphview/h;
      56: invokeinterface #48,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      61: pop
      62: goto          18
      65: aload_2
      66: areturn

  public java.util.List<de.blox.graphview.h> d(de.blox.graphview.h);
    Code:
       0: new           #19                 // class java/util/ArrayList
       3: dup
       4: invokespecial #20                 // Method java/util/ArrayList."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #24                 // Field b:Ljava/util/List;
      12: invokeinterface #52,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      17: astore_3
      18: aload_3
      19: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      24: ifeq          65
      27: aload_3
      28: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      33: checkcast     #41                 // class de/blox/graphview/d
      36: astore        4
      38: aload         4
      40: invokevirtual #128                // Method de/blox/graphview/d.b:()Lde/blox/graphview/h;
      43: aload_1
      44: invokevirtual #125                // Method de/blox/graphview/h.equals:(Ljava/lang/Object;)Z
      47: ifeq          18
      50: aload_2
      51: aload         4
      53: invokevirtual #122                // Method de/blox/graphview/d.a:()Lde/blox/graphview/h;
      56: invokeinterface #48,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      61: pop
      62: goto          18
      65: aload_2
      66: areturn
}
