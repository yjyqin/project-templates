## Intro

A template for jruby + sinatra + warbler

* view engine: HAML with layout support (views/layout.haml)
* default js/css files included: jquery, bootstrap, underscorejs

## Environment

* Windows 7 (x64)
* JRuby 9.0
* Tomcat 7

## Run

Run this command to bring it up, default address is http://localhost:9292/

```bash
jruby -S rackup
```

## Build WAR

```bash
jruby -S warble war
```