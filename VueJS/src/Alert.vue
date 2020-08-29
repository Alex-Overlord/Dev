<template>
  <div>
    <transition :css="false" @enter="enter" @leave="leave">
      <div v-if="visible">
        message de test
      </div>
    </transition>
    <button @click="toggle">Toggle</button>
  </div>
</template>

<script>
  let slides = {
    methods: {
      enter: function (el, done) {
        $(el).hide().slideDown(500, done)
      },
      leave: function (el, done) {
        $(el).show().slideUp(500, done)
      }
    }
  }
  export default {
    mixins: [slides],
    data () {
      return {
        visible: true
      }
    },
    methods: {
      toggle: function () {
        this.visible = !this.visible
      }
    }
  }
</script>

<style>
  .fade-enter-active, .fade-leave-active {
    transition: opacity .5s, transform .2s;
  }
  .fade-enter, .fade-leave-active {
    opacity: 0;
    transform: translateX(20px);
  }
</style>
