package bo.edu.instecmqsc.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class vocales extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener mOnCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    private AudioManager audioManager;

    AudioManager.OnAudioFocusChangeListener afChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {

                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT || focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
                        mediaPlayer.pause();
                        mediaPlayer.seekTo(0);

                    } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                        mediaPlayer.start();

                    } else if (focusChange ==
                            AudioManager.AUDIOFOCUS_LOSS) {

                        releaseMediaPlayer();
                    }
                }
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocales);
        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        ImageView portada = findViewById(R.id.vocalp);
        ImageView ima1 = findViewById(R.id.imageV1);
        ImageView ima2 = findViewById(R.id.imageV2);
        ImageView ima3 = findViewById(R.id.imageV3);
        TextView text1 = findViewById(R.id.editTextTextPersonName1);
        TextView text2 = findViewById(R.id.editTextTextPersonName2);
        TextView text3 = findViewById(R.id.editTextTextPersonName3);
        RelativeLayout s1 = findViewById(R.id.vocals1);
        RelativeLayout s2 = findViewById(R.id.vocals2);
        RelativeLayout s3 = findViewById(R.id.vocals3);

        final  int valor= getIntent().getIntExtra("valor",0);
        switch (valor)
        {

        //CASE 0 A
            case 0:
                portada.setImageResource(R.drawable.a_fw);
                portada.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.a);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });




                ima1.setImageResource(R.drawable.abeja_fw);
                text1.setText("ABEJA");
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.abeja);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });



                ima2.setImageResource(R.drawable.aguacate_fw);
                text2.setText("AGUACATE");
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.aguacate);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });


                ima3.setImageResource(R.drawable.avion_fw);
                text3.setText("AVIÓN");
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.avion);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });
                break;



            //CASE 1 E
            case 1:
                portada.setImageResource(R.drawable.e_fw);
                portada.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.e);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });




                ima1.setImageResource(R.drawable.elefante_fw);
                text1.setText("ELEFANTE");
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.elefante);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });



                ima2.setImageResource(R.drawable.erizo_fw);
                text2.setText("ERIZO");
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.erizo);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });


                ima3.setImageResource(R.drawable.espejo_fw);
                text3.setText("ESPEJO");
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.espejo);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });
                break;




            //CASE 2 I
            case 2:
                portada.setImageResource(R.drawable.i_fw);
                portada.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.i);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });




                ima1.setImageResource(R.drawable.iglesia_fw);
                text1.setText("IGLESIA");
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.iglesia);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });



                ima2.setImageResource(R.drawable.iglu_fw);
                text2.setText("IGLU");
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.iglu);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });


                ima3.setImageResource(R.drawable.isla_fw);
                text3.setText("ISLA");
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.isla);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });
                break;



            //CASE 3 O
            case 3:
                portada.setImageResource(R.drawable.o_fw);
                portada.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.o);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });




                ima1.setImageResource(R.drawable.oso_fw);
                text1.setText("OSO");
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.oso);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });



                ima2.setImageResource(R.drawable.oveja_fw);
                text2.setText("OVEJA");
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.oveja);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });


                ima3.setImageResource(R.drawable.ovni_fw);
                text3.setText("OVNI");
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.ovni);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });
                break;


            //CASE 4 U
            case 4:
                portada.setImageResource(R.drawable.u_fw);
                portada.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.u);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });




                ima1.setImageResource(R.drawable.uva_fw);
                text1.setText("UVA");
                s1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.uva);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });



                ima2.setImageResource(R.drawable.unicornio_fw);
                text2.setText("UNICORNIO");
                s2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.unicornio);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });


                ima3.setImageResource(R.drawable.universo_fw);
                text3.setText("UNIVERSO");
                s3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        releaseMediaPlayer();
                        //hago un requerimiento del focus de audio
                        int resultado = audioManager.requestAudioFocus(afChangeListener,AudioManager.STREAM_MUSIC,AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                        if(resultado==AudioManager.AUDIOFOCUS_REQUEST_GRANTED)
                        {
                            //ahora tenes el foco de audio
                            //Toast.makeText(Numeros.this,"hola",Toast.LENGTH_SHORT).show();
                            mediaPlayer = MediaPlayer.create(vocales.this,R.raw.universo);
                            mediaPlayer.start();
                            mediaPlayer.setOnCompletionListener(mOnCompletionListener);
                        }
                    }
                });
                break;

        }


    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }


    private void releaseMediaPlayer() {

        if (mediaPlayer != null) {

            mediaPlayer.release();


            mediaPlayer = null;
            audioManager.abandonAudioFocus(afChangeListener);
        }
    }

}