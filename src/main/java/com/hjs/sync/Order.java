package com.hjs.sync;


public class Order implements Runnable {

    //初始化票数是10
    private int ticketNum = 10;

    @Override
    public void run() {

        int threadNo = Integer.parseInt(Thread.currentThread().getName().substring(7));
        String saleWindows = "售票窗口" + threadNo;


            while (true){

                synchronized (new Object()){
                    if (ticketNum > 0){

                        try {
                            Thread.sleep(1000);
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                        System.out.println(saleWindows + " 卖出了" +ticketNum-- + "号票！");

                    }else {
                        break;
                    }
                }

            }



    }


    public static void main(String[] args) {

        Order order = new Order();
        new Thread(order).start();
        new Thread(order).start();
        new Thread(order).start();

    }
}
